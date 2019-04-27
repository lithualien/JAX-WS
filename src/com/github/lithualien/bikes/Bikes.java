package com.github.lithualien.bikes;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to get and set bike's attributes.
 * @author Tomas Dominauskas
 */

public class Bikes {

    private List<Bike> bike = new ArrayList<>();

    /**
     * Default constructor to make bikes class object.
     */
    public Bikes() {

    }

    /**
     * Class, which sets all the information given about the bike.
     * @param brand the brand of the bike.
     * @param colour the colour of the bike.
     * @param price the price of the bike in British Pounds.
     * @param type the type of the bike.
     * @param weight the weight of the bike.
     * @param gears the amount of gears the bike has.
     * @param wheelSize the bike's wheel size in inches.
     */

    public void setBike(String brand, String colour, float price, String type, double weight, int gears, int wheelSize) {
        Bike bike = new Bike();
        bike.setBrand(brand);
        bike.setColour(colour);
        bike.setPrice(price);
        bike.setType(type);
        bike.setWeight(weight);
        bike.setGears(gears);
        bike.setWheelSize(wheelSize);
        this.bike.add(bike);
    }

    /**
     * @return Returns Bike class list, which contains all the information about the bikes.
     */

    public List<Bike> getBike() {
        return bike;
    }
}