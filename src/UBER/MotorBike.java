/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UBER;

/**
 *
 * @author DELL
 */
public class MotorBike implements IRideType {

    @Override
    public int CalcPrice(int distance) {
        return distance * 10;
    }

}
