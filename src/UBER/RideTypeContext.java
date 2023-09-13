/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UBER;

/**
 *
 * @author DELL
 */
public class RideTypeContext {

    private IRideType rideType;
    private Request req;

    private RideTypeContext() {
    }

    private static RideTypeContext RTC_Instance = null;

    public static RideTypeContext getInstance() {
        if (RTC_Instance == null) {
            RTC_Instance = new RideTypeContext();
        }
        return RTC_Instance;
    }

    public void setStrategy(IRideType RT) {
        rideType = RT;
    }

    public double setPrice(Request req) {
        int d = req.calculateDistance();
        System.out.println("your ride type is " + req.getRideType());
        System.out.println("the price is " + rideType.CalcPrice(d));
        System.out.println("your pay type is " + req.getPayType());
        //System.out.println(req.passengerID);
        return (rideType.CalcPrice(d));
    }
}
