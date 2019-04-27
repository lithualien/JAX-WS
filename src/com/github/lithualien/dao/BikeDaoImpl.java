package com.github.lithualien.dao;

import com.github.lithualien.bikes.Bike;

import java.util.ArrayList;
import java.util.List;

public class BikeDaoImpl implements BikeDao {

    private List<Bike> bikes;

    public BikeDaoImpl() {
        bikes = new ArrayList<>();
        bikes.add(new Bike(1, "Baltic Wheel", "Electric", "White", 14.25, 21, 8, 989.99f));
        bikes.add(new Bike(2, "Baltic Wheel", "Electric", "Red", 14.35, 20, 9, 989.99f));
    }

    public List<Bike> getAll() {
        return bikes;
    }

    public Bike addBike(String brand, String type, String colour, double weight, int gears, int wheelSize, float price) {
        Bike bike = new Bike(3, brand, type, colour, weight, gears, wheelSize, price);
        bikes.add(bike);
        return bike;
    }
}
