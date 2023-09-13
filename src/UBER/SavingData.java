/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UBER;

import java.util.Hashtable;
import java.util.Vector;

/**
 *
 * @author USER
 */
public class SavingData {

    public static Hashtable<String, Driver> drivers;
    public static Hashtable<String, Passenger> passengers;
    public static Vector<Ticket> complaints;
    public static Vector<Request> requests;
//    public static String phoneDriver;
//    public static String phonePassenger;

    public SavingData() {
        this.passengers = new Hashtable<>();
        this.drivers = new Hashtable<>();
        this.complaints = new Vector();
        this.requests = new Vector();
    }

    public Hashtable getDrivers() {
        return drivers;
    }

    public Hashtable getPassengers() {
        return passengers;
    }

//    public static void addUser(User user) {
//        if (user instanceof Driver) {
//           
//            drivers.put(user.getPhoneNumber(), user);
//        } else if (user instanceof Passenger) {
//            passengers.put(user.getPhoneNumber(), user);
//        }
//    }
}
