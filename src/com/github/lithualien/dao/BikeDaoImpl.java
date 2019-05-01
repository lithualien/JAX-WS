package com.github.lithualien.dao;

import com.github.lithualien.bike.Bike;
import com.github.lithualien.shop.Shop;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to manage the data and transfer it to the
 * @author Tomas Dominauskas
 */

public class BikeDaoImpl implements BikeDao {

    private List<Bike> bikes;
    private int i = 3;

    /**
     * Class constructor to create a list and add few bike.
     */

    public BikeDaoImpl() {
        bikes = new ArrayList<>();
        bikes.add(new Bike(1, "Baltic Wheel", "Electric", "White", 14.25, 21, 8, 989.99f, "Verkiu g. 45, Vilnius", "37061234567"));
        bikes.add(new Bike(2, "Baltic Wheel", "Electric", "Red", 14.35, 20, 9, 989.99f, "Verkiu g. 45, Vilnius", "37061234567"));
    }

    /**
     * Method to get all bike.
     * @return the list of all bike.
     */

    public List<Bike> getAll() {
        return bikes;
    }

    /**
     * Method to add a new bike.
     * @param brand the brand of the bike.
     * @param type the type of the bike.
     * @param colour the colour of the bike.
     * @param weight the weight of the bike
     * @param gears the amount of geras of the bike.
     * @param wheelSize the size of the wheel of the bike.
     * @param price the price of the bike
     * @param address the address of the shop.
     * @param number the phone number of the shop.
     * @return the new bike.
     */

    public Bike addBike(String brand, String type, String colour, double weight, int gears, int wheelSize, float price, String address, String number) {
        Bike bike = new Bike(i, brand, type, colour, weight, gears, wheelSize, price, address, number);
        bikes.add(bike);
        i++;
        return bike;
    }

    /**
     * Method to update the existing bike.
     * @param ID the id of the bike.
     * @param brand the brand of the bike.
     * @param type the type of the bike.
     * @param colour the colour of the bike.
     * @param weight the weight of the bike
     * @param gears the amount of geras of the bike.
     * @param wheelSize the size of the wheel of the bike.
     * @param price the price of the bike.
     * @param address the address of the shop.
     * @param number the phone number of the shop.
     * @return the updated bike.
     */

    public Bike updateBike(int ID, String brand, String type, String colour, double weight, int gears, int wheelSize, float price, String address, String number) {
        bikes.get(ID - 1).setBrand(brand);
        bikes.get(ID - 1).setType(type);
        bikes.get(ID - 1).setColour(colour);
        bikes.get(ID - 1).setWeight(weight);
        bikes.get(ID - 1).setGears(gears);
        bikes.get(ID - 1).setWheelSize(wheelSize);
        bikes.get(ID - 1).setPrice(price);
        List<Shop> shops = new ArrayList<>();
        shops.add(new Shop(address, number));
        bikes.get(ID - 1).setShop(shops);
        return bikes.get(ID - 1);
    }

    /**
     * Method to delete the existing bike.
     * @param ID the id of the bike.
     * @return true or false, depending of success of the operation.
     */

    public boolean deleteBike(int ID) {
        for (Bike temp : bikes) {
            if(temp.getID() == ID) {
                bikes.remove(ID - 1);
                return true;
            }
        }
        return false;
    }

    /**
     * Method to count the amount of the bike.
     * @return number of the bike.
     */

    public int countBikes() {
        return bikes.size();
    }
}
