/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UBER;

/**
 *
 * @author DELL
 */
public class RideFactory {

    public IRideType createType(String ride) {
        switch (ride) {
            case "Bus":
                return new Bus();

            case "Normal":
                return new Normal();

            case "Premium":
                return new Premium();

            case "MotorBike":
                return new MotorBike();

            default:
                throw new IllegalArgumentException("Unknown ride type: " + ride);
        }

    }

}
