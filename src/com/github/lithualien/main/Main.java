package com.github.lithualien.main;

import com.github.lithualien.ws.BikeServiceImpl;

import javax.xml.ws.Endpoint;

public class Main {

    public static void main(String[] argv) {
        Endpoint.publish("http://localhost:8080/JAX_WS/services/BikeService?wsdl", new BikeServiceImpl());
    }
}
