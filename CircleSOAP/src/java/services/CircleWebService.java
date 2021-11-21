/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author asus
 */
@WebService(serviceName = "CircleWebService")
public class CircleWebService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "calArea")
    public double calArea(@WebParam(name = "radius") double radius) {
        //TODO write your implementation code here:
        double area = Math.PI * radius * radius;
        return area;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "calCircumference")
    public double calCircumference(@WebParam(name = "radius") double radius) {
        //TODO write your implementation code here:
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }

    
}
