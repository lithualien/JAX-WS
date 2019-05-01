package com.github.lithualien.ws;

import com.github.lithualien.bike.Bike;
import com.github.lithualien.dao.BikeDao;
import com.github.lithualien.dao.BikeDaoImpl;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * Class to manage web services.
 * @author Tomas Dominauskas
 */

@WebService(endpointInterface = "com.github.lithualien.ws.BikeService")
public class BikeServiceImpl implements BikeService {

    private BikeDao bikeDaoImpl = new BikeDaoImpl();

    /**
     * Class constructor.
     */

    public BikeServiceImpl() {

    }

    /**
     * Web method to get all bike.
     * @return the list of all bike.
     */

    @WebMethod
    public List<Bike> getBike() {
        return bikeDaoImpl.getAll();
    }

    /**
     * Web method to add a new bike.
     * @param brand the brand of the bike.
     * @param type the type of the bike.
     * @param colour the colour of the bike.
     * @param weight the weight of the bike
     * @param gears the amount of geras of the bike.
     * @param wheelSize the size of the wheel of the bike.
     * @param price the price of the bike
     * @return the new bike.
     */

    @WebMethod
    public Bike addBike(String brand, String type, String colour, double weight, int gears, int wheelSize, float price) {
       return bikeDaoImpl.addBike(brand, type, colour, weight, gears, wheelSize, price);
    }

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
     * @return the updated bike.
     */

    @WebMethod
    public Bike updateBike(int ID, String brand, String type, String colour, double weight, int gears, int wheelSize, float price) {
        return bikeDaoImpl.updateBike(ID, brand, type, colour, weight, gears, wheelSize, price);
    }

    /**
     * Web method to delete the existing bike.
     * @param ID the id of the bike.
     * @return true or false, depending of success of the operation.
     */

    @WebMethod
    public boolean deleteBike(int ID) {
        return bikeDaoImpl.deleteBike(ID);
    }

    /**
     * Web method to count the amount of the bike.
     * @return number of the bike.
     */

    @Override
    public int countBikes() {
        return bikeDaoImpl.countBikes();
    }
}
