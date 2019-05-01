package com.github.lithualien.dao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BikeDaoImplTest {
    private BikeDao bikeDaoImpl;

    @Before
    public void setUp(){
        bikeDaoImpl = new BikeDaoImpl();
    }

    @After
    public void tearDown() {
        bikeDaoImpl = null;
    }

    @Test
    public void getAll() {
        assertEquals("Baltic Wheel", bikeDaoImpl.getAll().get(bikeDaoImpl.countBikes() - 1).getBrand());
        assertEquals("Electric", bikeDaoImpl.getAll().get(bikeDaoImpl.countBikes() - 1).getType());
        assertEquals("Red", bikeDaoImpl.getAll().get(bikeDaoImpl.countBikes() - 1).getColour());
        assertEquals(14.35, bikeDaoImpl.getAll().get(bikeDaoImpl.countBikes() - 1).getWeight(), 0.01);
        assertEquals(20, bikeDaoImpl.getAll().get(bikeDaoImpl.countBikes() - 1).getGears());
        assertEquals(9, bikeDaoImpl.getAll().get(bikeDaoImpl.countBikes() - 1).getWheelSize());
        assertEquals(989.99f, bikeDaoImpl.getAll().get(bikeDaoImpl.countBikes() - 1).getPrice(), 0.01);
    }

    @Test
    public void addBike() {
        bikeDaoImpl.addBike("Baltik Vairas", "plento", "raudona", 16.85, 21, 8, 499.99f, "Verkiu g. 45, Vilnius", "37061234567");
        assertEquals("Baltik Vairas", bikeDaoImpl.getAll().get(bikeDaoImpl.countBikes() - 1).getBrand());
        assertEquals("plento", bikeDaoImpl.getAll().get(bikeDaoImpl.countBikes() - 1).getType());
        assertEquals("raudona", bikeDaoImpl.getAll().get(bikeDaoImpl.countBikes() - 1).getColour());
        assertEquals(16.85, bikeDaoImpl.getAll().get(bikeDaoImpl.countBikes() - 1).getWeight(), 0.01);
        assertEquals(21, bikeDaoImpl.getAll().get(bikeDaoImpl.countBikes() - 1).getGears());
        assertEquals(8, bikeDaoImpl.getAll().get(bikeDaoImpl.countBikes() - 1).getWheelSize());
        assertEquals(499.99f, bikeDaoImpl.getAll().get(bikeDaoImpl.countBikes() - 1).getPrice(), 0.01);
        assertEquals("Verkiu g. 45, Vilnius", bikeDaoImpl.getAll().get(bikeDaoImpl.countBikes() - 1).getShop().get(0).getAddress());
        assertEquals("37061234567", bikeDaoImpl.getAll().get(bikeDaoImpl.countBikes() - 1).getShop().get(0).getNumber());
    }

    @Test
    public void updateBike() {
        bikeDaoImpl.updateBike(2, "Baltic Wheel", "Electric", "Pink", 14.35, 20, 9, 989.99f, "Verkiu g. 45, Vilnius", "37061234567");
        assertEquals("Baltic Wheel", bikeDaoImpl.getAll().get(bikeDaoImpl.countBikes() - 1).getBrand());
        assertEquals("Electric", bikeDaoImpl.getAll().get(bikeDaoImpl.countBikes() - 1).getType());
        assertEquals("Pink", bikeDaoImpl.getAll().get(bikeDaoImpl.countBikes() - 1).getColour());
        assertEquals(14.35, bikeDaoImpl.getAll().get(bikeDaoImpl.countBikes() - 1).getWeight(), 0.01);
        assertEquals(20, bikeDaoImpl.getAll().get(bikeDaoImpl.countBikes() - 1).getGears());
        assertEquals(9, bikeDaoImpl.getAll().get(bikeDaoImpl.countBikes() - 1).getWheelSize());
        assertEquals(989.99f, bikeDaoImpl.getAll().get(bikeDaoImpl.countBikes() - 1).getPrice(), 0.01);
        assertEquals("Verkiu g. 45, Vilnius", bikeDaoImpl.getAll().get(bikeDaoImpl.countBikes() - 1).getShop().get(0).getAddress());
        assertEquals("37061234567", bikeDaoImpl.getAll().get(bikeDaoImpl.countBikes() - 1).getShop().get(0).getNumber());

    }

    @Test
    public void deleteBike() {
        assertTrue(bikeDaoImpl.deleteBike(2));
    }

    @Test
    public void countBikes() {
        assertEquals(2, bikeDaoImpl.countBikes());
    }
}