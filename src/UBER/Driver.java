/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UBER;

import static UBER.SavingData.drivers;
import static UBER.SavingData.passengers;
import static UBER.SavingData.requests;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author USER
 */
public class Driver extends User {

    private String license;
    private String vehicleType;
    private String vehicleModel;
    private String vehicleColor;
    private String vehiclePlate;
    private boolean driving = false;
    private double rate;
//    private String id;
//    private int rate;

    public Driver(String phoneNumber, String email, String password, String type) {
        super(phoneNumber, email, password, type);
    }

    public Driver(String username, String email, String password, String confirmPassword, String phoneNumber, String role,
            String license, String vehicleType, String vehicleModel, String vehicleColor, String vehiclePlate) {
        super(username, email, password, confirmPassword, phoneNumber, "driver");

        this.license = license;
        this.vehicleType = vehicleType;
        this.vehicleModel = vehicleModel;
        this.vehicleColor = vehicleColor;
        this.vehiclePlate = vehiclePlate;
        rate = 1;
    }

    public Driver(String username, String email, String password, String phoneNumber, String role,
            String license, String vehicleType, String vehicleModel, String vehicleColor, String vehiclePlate) {

        super(phoneNumber, email, username, password, "driver");

        this.license = license;
        this.vehicleType = vehicleType;
        this.vehicleModel = vehicleModel;
        this.vehicleColor = vehicleColor;
        this.vehiclePlate = vehiclePlate;
        rate = 1;

    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehiclePlate() {
        return vehiclePlate;
    }

    public String getLicense() {
        return license;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public boolean getDriving() {
        return driving;
    }

    public void setDriving(boolean driving) {
        this.driving = driving;
    }

    public void choose_req(int requestid, String phoneDriver) {

        requests.get(requestid - 1).Chosen = true;
        requests.get(requestid - 1).setDrivertoken(phoneDriver);
        drivers.get(phoneDriver).setDriving(true);

    }

    public void FinishRide(int rid) {
        requests.get(rid - 1).FinshRide = true;
        requests.remove(requests.get(rid - 1));
    }

}
