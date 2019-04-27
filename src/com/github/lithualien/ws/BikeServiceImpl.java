package com.github.lithualien.ws;

import com.github.lithualien.bikes.Bike;
import com.github.lithualien.dao.BikeDao;
import com.github.lithualien.dao.Dao;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface = "com.github.lithualien.ws.BikeService")
public class BikeServiceImpl implements BikeService {

    private Dao bikeDao;
    private List<Bike> bikes = new ArrayList<>();

    @WebMethod
    @Override
    public List<Bike> getBike() {
        bikeDao = new BikeDao();
        return bikeDao.getAll();
    }
}
