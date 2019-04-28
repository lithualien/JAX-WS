package com.github.lithualien.dao;

import com.github.lithualien.bikes.Bike;
import java.util.List;

public interface BikeDao {
    List<Bike> getAll();
    Bike addBike(String brand, String type, String colour, double weight, int gears, int wheelSize, float price);
    Bike updateBike(int ID, String brand, String type, String colour, double weight, int gears, int wheelSize, float price);
    boolean deleteBike(int ID);
}
