/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UBER;

/**
 *
 * @author DELL
 */
public class PayFactory {

    public IPayType createPayType(String PayType) {
        switch (PayType) {
            case "Cash":
                return new Cash();

            case "Visa":
                return new Visa();

            default:
                throw new IllegalArgumentException("Unknown ride type: " + PayType);
        }

    }
}
