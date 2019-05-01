package com.github.lithualien.dao;
import com.github.lithualien.bike.Bike;

import java.util.List;

/**
 * The Data Access Object to save and transfer data to web service.
 * @author Tomas Dominauskas
 */

public interface BikeDao {

    /**
     * Method to get all bike.
     * @return the list of all bike.
     */

    List<Bike> getAll();

    /**
     * Method to add a new bike.
     * @param brand the brand of the bike.
     * @param type the type of the bike.
     * @param colour the colour of the bike.
     * @param weight the weight of the bike
     * @param gears the amount of geras of the bike.
     * @param wheelSize the size of the wheel of the bike.
     * @param price the price of the bike
     * @return the new bike.
     */

    Bike addBike(String brand, String type, String colour, double weight, int gears, int wheelSize, float price);

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
     * @return the updated bike.
     */

    Bike updateBike(int ID, String brand, String type, String colour, double weight, int gears, int wheelSize, float price);

    /**
     * Method to delete the existing bike.
     * @param ID the id of the bike.
     * @return true or false, depending of success of the operation.
     */

    boolean deleteBike(int ID);

    /**
     * Method to count the amount of the bike.
     * @return number of the bike.
     */

    int countBikes();
}
