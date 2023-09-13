/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UBER;

import UBER.myLocations.Locations;

/**
 *
 * @author DELL
 */
public class Request {

    public boolean Chosen = false;
    private String destenation;
    private String location;
    private String rideType;
    private String payType;
    private static int requestID = 0;
    private int myid;
    private String passengerPhoneNumber;
    public boolean FinshRide;
    private String drivertoken;
    private double requestPrice;

    public Request(String destenation, String location, String rideType, String payType, String passengerPhoneNumber) {
        requestID++;
        myid = requestID;
        this.destenation = destenation;
        this.location = location;
        this.rideType = rideType;
        this.payType = payType;
        this.passengerPhoneNumber = passengerPhoneNumber;
        this.requestPrice = requestPrice;

    }

    public String getDestenation() {
        return destenation;
    }

    public void setDestenation(String destenation) {
        this.destenation = destenation;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRideType() {
        return rideType;
    }

    public void setRideType(String RideType) {
        this.rideType = RideType;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String PayType) {
        this.payType = PayType;
    }

    public static int getReqID() {
        return requestID;
    }

    public static void setReqID(int requestID) {
        Request.requestID = requestID;
    }

    public int getMyid() {
        return myid;
    }

    public void setMyid(int myId) {
        this.myid = myId;
    }

    public String getPassengerPhoneNumber() {
        return passengerPhoneNumber;
    }

    public void setPassengerPhoneNumber(String PassengerPhoneNumber) {
        this.passengerPhoneNumber = PassengerPhoneNumber;
    }

    public double getRequestprice() {
        return requestPrice;
    }

    public void setRequestprice(double requestprice) {
        this.requestPrice = requestprice;
    }

    public String getDrivertoken() {
        return drivertoken;
    }

    public void setDrivertoken(String drivertoken) {
        this.drivertoken = drivertoken;
    }

    public int calculateDistance() {
        int calcDistenation = Locations.valueOf(destenation).value;
        int calclocation = Locations.valueOf(location).value;

        int h = Math.abs(calcDistenation - calclocation);

        return h;

    }
}
