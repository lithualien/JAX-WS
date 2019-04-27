package com.github.lithualien.dao;

import com.github.lithualien.bikes.Bike;

import java.util.ArrayList;
import java.util.List;

public class BikeDao implements Dao<Bike> {

    private List<Bike> bikes = new ArrayList<>();

    public BikeDao() {
        bikes.add(new Bike(1, "Baltic Wheel", "Electric", "White", 14.25, 21, 8, 989.99f));
        bikes.add(new Bike(2, "Baltic Wheel", "Electric", "Red", 14.35, 20, 9, 989.99f));
    }

    @Override
    public List<Bike> getAll() {
        return bikes;
    }
}
