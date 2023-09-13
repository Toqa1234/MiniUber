/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UBER;

import static UBER.SavingData.drivers;
import static UBER.SavingData.passengers;

/**
 *
 * @author dell
 */
public class PasswordAvailability implements Chain {

    private Chain nextChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    public String check(User user) {
        if (!checkPassAvailability(user)) {

            {
                if (nextChain != null) {
                    return nextChain.check(user);
                }
                return "done";  // Return done if the email is not taken
            }
        }
        return "passwordNotExist";
    }

    public boolean checkPassAvailability(User user) {

        String role = user.getRole();

        if (role.equals("driver")) {
            for (User driver : drivers.values()) {

                if (driver.getPassword().equals(user.getPassword())) {
                    return false;
                }
            }
            return true;

        } else if (role.equals("passenger")) {
            for (User passenger : passengers.values()) {

                if (passenger.getPassword().equals(user.getPassword())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

}
