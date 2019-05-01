package com.github.lithualien.ws;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BikeServiceImplTest {

    private BikeService bikeServiceImpl;

    @Before
    public void setUp(){
        bikeServiceImpl = new BikeServiceImpl();
    }

    @After
    public void tearDown() {
        bikeServiceImpl = null;
    }

    @Test
    public void getAll() {
        assertEquals("Baltic Wheel", bikeServiceImpl.getBike().get(bikeServiceImpl.countBikes() - 1).getBrand());
        assertEquals("Electric", bikeServiceImpl.getBike().get(bikeServiceImpl.countBikes() - 1).getType());
        assertEquals("Red", bikeServiceImpl.getBike().get(bikeServiceImpl.countBikes() - 1).getColour());
        assertEquals(14.35, bikeServiceImpl.getBike().get(bikeServiceImpl.countBikes() - 1).getWeight(), 0.01);
        assertEquals(20, bikeServiceImpl.getBike().get(bikeServiceImpl.countBikes() - 1).getGears());
        assertEquals(9, bikeServiceImpl.getBike().get(bikeServiceImpl.countBikes() - 1).getWheelSize());
        assertEquals(989.99f, bikeServiceImpl.getBike().get(bikeServiceImpl.countBikes() - 1).getPrice(), 0.01);
    }

    @Test
    public void addBike() {
        bikeServiceImpl.addBike("Baltik Vairas", "plento", "raudona", 16.85, 21, 8, 499.99f, "Verkiu g. 45, Vilnius", "37061234567");
        assertEquals("Baltik Vairas", bikeServiceImpl.getBike().get(bikeServiceImpl.countBikes() - 1).getBrand());
        assertEquals("plento", bikeServiceImpl.getBike().get(bikeServiceImpl.countBikes() - 1).getType());
        assertEquals("raudona", bikeServiceImpl.getBike().get(bikeServiceImpl.countBikes() - 1).getColour());
        assertEquals(16.85, bikeServiceImpl.getBike().get(bikeServiceImpl.countBikes() - 1).getWeight(), 0.01);
        assertEquals(21, bikeServiceImpl.getBike().get(bikeServiceImpl.countBikes() - 1).getGears());
        assertEquals(8, bikeServiceImpl.getBike().get(bikeServiceImpl.countBikes() - 1).getWheelSize());
        assertEquals(499.99f, bikeServiceImpl.getBike().get(bikeServiceImpl.countBikes() - 1).getPrice(), 0.01);
        assertEquals("Verkiu g. 45, Vilnius", bikeServiceImpl.getBike().get(bikeServiceImpl.countBikes() - 1).getShop().get(0).getAddress());
        assertEquals("37061234567", bikeServiceImpl.getBike().get(bikeServiceImpl.countBikes() - 1).getShop().get(0).getNumber());
    }

    @Test
    public void updateBike() {
        bikeServiceImpl.updateBike(2, "Baltic Wheel", "Electric", "Pink", 14.35, 20, 9, 989.99f, "Verkiu g. 45, Vilnius", "37061234567");
        assertEquals("Baltic Wheel", bikeServiceImpl.getBike().get(bikeServiceImpl.countBikes() - 1).getBrand());
        assertEquals("Electric", bikeServiceImpl.getBike().get(bikeServiceImpl.countBikes() - 1).getType());
        assertEquals("Pink", bikeServiceImpl.getBike().get(bikeServiceImpl.countBikes() - 1).getColour());
        assertEquals(14.35, bikeServiceImpl.getBike().get(bikeServiceImpl.countBikes() - 1).getWeight(), 0.01);
        assertEquals(20, bikeServiceImpl.getBike().get(bikeServiceImpl.countBikes() - 1).getGears());
        assertEquals(9, bikeServiceImpl.getBike().get(bikeServiceImpl.countBikes() - 1).getWheelSize());
        assertEquals(989.99f, bikeServiceImpl.getBike().get(bikeServiceImpl.countBikes() - 1).getPrice(), 0.01);

    }

    @Test
    public void deleteBike() {
        assertTrue(bikeServiceImpl.deleteBike(2));
    }

    @Test
    public void countBikes() {
        assertEquals(2, bikeServiceImpl.countBikes());
    }
}