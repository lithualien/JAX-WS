package com.github.lithualien.ws;

import com.github.lithualien.bikes.Bike;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface BikeService {
    @WebMethod
    List<Bike> getBike();

    @WebMethod
    Bike addBike(@WebParam(name = "brand") String brand,
                 @WebParam(name = "type") String type,
                 @WebParam(name = "colour") String colour,
                 @WebParam(name = "weight") double weight,
                 @WebParam(name = "gears") int gears,
                 @WebParam(name = "wheelSize") int wheelSize,
                 @WebParam(name = "price") float price);
}
