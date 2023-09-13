/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UBER;

import static UBER.SavingData.drivers;
import static UBER.SavingData.passengers;

/**
 *
 * @author USER
 */
public class EmailAvailability implements Chain {

    private Chain nextChain;
    private boolean registration;

    public EmailAvailability(boolean registration) {

        this.registration = registration;

    }

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    public String check(User user) {
        if (!checkEmailAvailability(user.getEmail(), user.getRole())) {
            if (registration) {
                if (nextChain != null) {
                    return nextChain.check(user);
                }
                return "done";  // Return 0 if the email is not taken
            } else {
                return "emailNotExists";
            }
        } else {
            if (registration) {
                return "emailExists";
            } else {

                if (nextChain != null) {
                    return nextChain.check(user);
                }
                return "done";
            }
        }
    }

    public boolean checkEmailAvailability(String email, String role) {

        if (role.equals("driver")) {
            for (User driver : drivers.values()) {

                if (driver.getEmail().equals(email)) {
                    return true;
                }
            }
            return false;
        } else if (role.equals("passenger")) {
            for (User passenger : passengers.values()) {

                if (passenger.getEmail().equals(email)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
