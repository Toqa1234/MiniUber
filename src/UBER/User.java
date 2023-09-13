/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UBER;

/**
 *
 * @author USER
 */
public abstract class User {

    private String username;
    private String email;
    private String password;
    private String confirmPassword;
    private String phoneNumber;
    private String role;

    public User(String username, String email, String password, String confirmPassword, String phoneNumber, String role) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.confirmPassword = confirmPassword;
        this.role = role;
    }

    public User() {

    }

    public User(String phoneNumber, String email, String password, String type) {
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        role = type;
    }

    public User(String phoneNumber, String email, String username, String password, String type) {
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.username = username;
        role = type;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getconfirmPassword() {
        return confirmPassword;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getRole() {
        return role;
    }

    public String login(User user) {

        if ("admin".equals(user.getRole())) {

            if (user.getEmail().equals("esraa123@gmail.com") && user.getPhoneNumber().equals("01-124-631472")
                    && user.getPassword().equals("esraa123")) {

                return "done";

            } else {
                System.out.println("login func");
            }
        } else {
            // Create a chain of responsibility to check phone number, email, and password availability in the database
            Chain emailCheck = new EmailAvailability(false);
            Chain phoneCheck = new PhoneNumberAvailability(false);
            Chain passCheck = new PasswordAvailability();

            phoneCheck.setNextChain(emailCheck);
            emailCheck.setNextChain(passCheck);
            String result = phoneCheck.check(user);

            return result;
        }
        return " ";

    }

//    abstract boolean register(String username, String email, String password, String phoneNumber);
}
