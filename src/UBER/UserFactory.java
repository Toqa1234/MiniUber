/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UBER;

/**
 *
 * @author dell
 */
public class UserFactory implements IUserFactory {

    @Override
    public User getUser(String Type, String phone, String email, String password) {

        switch (Type) {
            case "driver":
                return new Driver(phone, email, password, Type);
            case "passenger":
                return new Passenger(phone, email, password, Type);
            case "admin":
                return new Admin(phone, email, password, Type);

            default:
                return null;
        }
    }

}
