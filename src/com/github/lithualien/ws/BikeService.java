package com.github.lithualien.ws;

import com.github.lithualien.bike.Bike;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

/**
 * Class of the web service interface.
 * @author Tomas Dominauskas
 */

@WebService
public interface BikeService {

    /**
     * Web method to get all bike.
     * @return the list of all bike.
     */

    @WebMethod
    List<Bike> getBike();

    /**
     * Web method to add a new bike.
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

    @WebMethod
    Bike addBike(@WebParam(name = "brand") String brand,
                 @WebParam(name = "type") String type,
                 @WebParam(name = "colour") String colour,
                 @WebParam(name = "weight") double weight,
                 @WebParam(name = "gears") int gears,
                 @WebParam(name = "wheelSize") int wheelSize,
                 @WebParam(name = "price") float price,
                 @WebParam(name = "address") String address,
                 @WebParam(name = "number")String number);

    /**
     * Web method to update the existing bike.
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

    @WebMethod
    Bike updateBike(@WebParam(name = "ID") int ID,
                    @WebParam(name = "brand") String brand,
                    @WebParam(name = "type") String type,
                    @WebParam(name = "colour") String colour,
                    @WebParam(name = "weight") double weight,
                    @WebParam(name = "gears") int gears,
                    @WebParam(name = "wheelSize") int wheelSize,
                    @WebParam(name = "price") float price,
                    @WebParam(name = "address") String address,
                    @WebParam(name = "number")String number);

    /**
     * Web method to delete the existing bike.
     * @param ID the id of the bike.
     * @return true or false, depending of success of the operation.
     */

    @WebMethod
    boolean deleteBike(@WebParam(name = "ID") int ID);

    /**
     * Web method to count the amount of the bike.
     * @return number of the bike.
     */

    @WebMethod
    int countBikes();
}
