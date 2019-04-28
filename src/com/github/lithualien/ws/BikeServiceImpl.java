package com.github.lithualien.ws;

import com.github.lithualien.bikes.Bike;
import com.github.lithualien.dao.BikeDao;
import com.github.lithualien.dao.BikeDaoImpl;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "com.github.lithualien.ws.BikeService")
public class BikeServiceImpl implements BikeService {

    private BikeDao bikeDaoImpl = new BikeDaoImpl();

    @WebMethod
    public List<Bike> getBike() {
        return bikeDaoImpl.getAll();
    }

    @WebMethod
    public Bike addBike(String brand, String type, String colour, double weight, int gears, int wheelSize, float price) {
       return bikeDaoImpl.addBike(brand, type, colour, weight, gears, wheelSize, price);
    }

    @WebMethod
    public Bike updateBike(int ID, String brand, String type, String colour, double weight, int gears, int wheelSize, float price) {
        return bikeDaoImpl.updateBike(ID, brand, type, colour, weight, gears, wheelSize, price);
    }

    @WebMethod
    public boolean deleteBike(int ID) {
        return bikeDaoImpl.deleteBike(ID);
    }
}
