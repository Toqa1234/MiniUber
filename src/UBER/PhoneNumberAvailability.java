/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UBER;

import static UBER.SavingData.drivers;
import static UBER.SavingData.passengers;
import java.util.Hashtable;

/**
 *
 * @author USER
 */
public class PhoneNumberAvailability implements Chain {

    private Chain nextChain;
    public boolean Registration;

    public PhoneNumberAvailability(boolean Registration) {
        this.Registration = Registration;
    }

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public String check(User user) {

        if (!checkPhoneAvailability(user.getPhoneNumber(), user.getRole())) {
            if (Registration) {

                if (nextChain != null) {
                    return nextChain.check(user);
                }
                return "done";  // Return 0 if the email is not taken
            } else {
                return "phoneNotExists";
            }
        } else {

            if (Registration) {
                return "phoneExists";

            } else {

                if (nextChain != null) {
                    return nextChain.check(user);
                }
                return "done";
            }
        }
    }

    public boolean checkPhoneAvailability(String Phone, String role) {
        if (role.equals("driver")) {
            if (drivers.containsKey(Phone)) {       
                return true;
            } else {

                return false;
            }
        } else if (role.equals("passenger")) {
            if (passengers.containsKey(Phone)) {    
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

}
