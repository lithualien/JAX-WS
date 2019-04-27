package com.github.lithualien.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface BikeService {
    @WebMethod
    List getBike();
}
