package com.github.lithualien.ws;

import com.github.lithualien.bikes.Bike;
import com.github.lithualien.dao.BikeDao;
import com.github.lithualien.dao.BikeDaoImpl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
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
    public Bike addBike(@WebParam(name = "brand") String brand,
                        @WebParam(name = "type") String type,
                        @WebParam(name = "colour") String colour,
                        @WebParam(name = "weight") double weight,
                        @WebParam(name = "gears") int gears,
                        @WebParam(name = "wheelSize") int wheelSize,
                        @WebParam(name = "price") float price) {
       return bikeDaoImpl.addBike(brand, type, colour, weight, gears, wheelSize, price);
    }
}
