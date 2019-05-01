package com.github.lithualien.shop;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    private Shop shop1, shop2;

    @Before
    public void setUp() {
        shop1 = new Shop();
    }

    @After
    public void tearDown() {
        shop1 = null;
        shop2 = null;
    }

    @Test
    public void getNumber() {
        shop1.setNumber("+37061234567");
        assertEquals("+37061234567", shop1.getNumber());
    }

    @Test
    public void getAddress() {
        shop1.setAddress("Verkių g. 45, Vilnius");
        assertEquals("Verkių g. 45, Vilnius", shop1.getAddress());
    }

    @Test
    public void toString1() {
        shop2 = new Shop( "Verkių g. 45, Vilnius", "+37061234567");
        assertEquals(" | Adresas: Verkių g. 45, Vilnius | Numeris: +37061234567", shop2.toString());
    }
}