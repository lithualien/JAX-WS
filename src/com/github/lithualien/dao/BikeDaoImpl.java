package com.github.lithualien.dao;

import com.github.lithualien.bikes.Bike;

import java.util.ArrayList;
import java.util.List;

public class BikeDaoImpl implements BikeDao {

    private List<Bike> bikes;
    private int i = 3;

    public BikeDaoImpl() {
        bikes = new ArrayList<>();
        bikes.add(new Bike(1, "Baltic Wheel", "Electric", "White", 14.25, 21, 8, 989.99f));
        bikes.add(new Bike(2, "Baltic Wheel", "Electric", "Red", 14.35, 20, 9, 989.99f));
    }

    public List<Bike> getAll() {
        return bikes;
    }

    public Bike addBike(String brand, String type, String colour, double weight, int gears, int wheelSize, float price) {
        Bike bike = new Bike(i, brand, type, colour, weight, gears, wheelSize, price);
        bikes.add(bike);
        i++;
        return bike;
    }

    @Override
    public Bike updateBike(int ID, String brand, String type, String colour, double weight, int gears, int wheelSize, float price) {
        bikes.get(ID - 1).setBrand(brand);
        bikes.get(ID - 1).setType(type);
        bikes.get(ID - 1).setColour(colour);
        bikes.get(ID - 1).setWeight(weight);
        bikes.get(ID - 1).setGears(gears);
        bikes.get(ID - 1).setWheelSize(wheelSize);
        bikes.get(ID - 1).setPrice(price);
        return bikes.get(ID - 1);
    }

    @Override
    public boolean deleteBike(int ID) {
        for (Bike temp : bikes) {
            if(temp.getID() == ID) {
                bikes.remove(ID - 1);
                return true;
            }
        }
        return false;
    }
}
