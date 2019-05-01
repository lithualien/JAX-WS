package com.github.lithualien.main;

import com.github.lithualien.ws.BikeServiceImpl;
import javax.xml.ws.Endpoint;

/**
 * The main class to publish the web service.
 * @author Tomas Dominauskas
 */

public class Main {

    /**
     * The main method to publish web service.
     * @param argv
     */

    public static void main(String[] argv) {
        Endpoint.publish("http://localhost:8080/JAX_WS/services/BikeService?wsdl", new BikeServiceImpl());
    }
}
