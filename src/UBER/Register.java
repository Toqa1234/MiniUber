/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UBER;

//import static UBER.SavingData.addUser;
import static UBER.SavingData.drivers;
import static UBER.SavingData.passengers;

/**
 *
 * @author USER
 */
public class Register {

    private Chain checkEmailValidation;
    private Chain checkEmailAvailability;
    private Chain checkPasswordValidation;
    private Chain checkPhoneNumberAvailability;

    public Register() {
        this.checkEmailValidation = new EmailValidator();
        this.checkEmailAvailability = new EmailAvailability(true);
        this.checkPasswordValidation = new PasswordValidator();
        this.checkPhoneNumberAvailability = new PhoneNumberAvailability(true);

        checkEmailValidation.setNextChain(checkEmailAvailability);
        checkEmailAvailability.setNextChain(checkPasswordValidation);
        checkPasswordValidation.setNextChain(checkPhoneNumberAvailability);
    }

    public String register(String username, String email, String password, String confirmPassword, String phoneNumber) {
        // Create a Passenger object with the given information
        Passenger user = new Passenger(username, email, password, confirmPassword, phoneNumber, "Passenger");
        // Start the chain of responsibility and get the result
        String result = checkEmailValidation.check(user);

        if (result.equals("done")) {
            // If result is equal zero, add it to the hashtable
            // addUser(user);
            passengers.put(user.getPhoneNumber(), user);

        }
        return result;
    }

    public String register(String username, String email, String password, String confirmPassword, String phoneNumber,
            String license, String vehicleType, String vehicleModel, String vehicleColor, String vehiclePlate) {

        Driver driver = new Driver(username, email, password, confirmPassword, phoneNumber, "driver",
                license, vehicleType, vehicleModel, vehicleColor, vehiclePlate);

        String result = checkEmailValidation.check(driver);

        if (result.equals("done")) {

            drivers.put(driver.getPhoneNumber(), driver);
        }
        return result;
    }
}
