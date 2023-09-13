/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UBER;

/**
 *
 * @author DELL
 */
public class myLocations {

    enum Locations {
        Cairo(15),
        Alexandria(25),
        Aswan(40),
        Giza(10),
        Qalyubia(30),
        Suez(50),
        El_Mansoura(45),
        Tanta(23),
        Asyut(32),
        Fayoum(43),
        Zagazig(38),
        Ismailia(12),
        Damanhur(20),
        Obour_City(45),
        Nasr_City(60),
        Luxor(55),
        El_Marg(35),
        El_Maadi(19),
        Minya(53),
        Damietta(27);

        public int value;

        Locations(int value) {
            this.value = value;
        }
    }
}
