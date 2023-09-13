/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UBER;

import static UBER.SavingData.complaints;
import static UBER.SavingData.drivers;
import static UBER.SavingData.passengers;
import static UBER.SavingData.requests;

/**
 *
 * @author USER
 */
public class UBER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SavingData h = new SavingData(); 
        Data userdata;
        userdata = Data.getInstance();
        userdata.GetFromDatabase();
        userdata.GetcomplaintFromDatabase();

        Intro r = new Intro();
        r.setVisible(true);

    }
}
