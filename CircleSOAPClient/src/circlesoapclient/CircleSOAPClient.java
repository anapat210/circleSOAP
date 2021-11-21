/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circlesoapclient;

/**
 *
 * @author asus
 */
public class CircleSOAPClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(calArea(10.0));
        System.out.println(calCircumference(10.0));
    }

    private static double calArea(double radius) {
        servicesClient.CircleWebService_Service service = new servicesClient.CircleWebService_Service();
        servicesClient.CircleWebService port = service.getCircleWebServicePort();
        return port.calArea(radius);
    }

    private static double calCircumference(double radius) {
        servicesClient.CircleWebService_Service service = new servicesClient.CircleWebService_Service();
        servicesClient.CircleWebService port = service.getCircleWebServicePort();
        return port.calCircumference(radius);
    }
    
    
}
