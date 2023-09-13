/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UBER;

/**
 *
 * @author DELL
 */
public class Ticket {

    private String passengerPhone;
    private String driverName;
    private String driverPhone;
    private String Complaint;

    public Ticket(String passengerPhone, String driverName, String driverPhone, String Complaint) {
        this.passengerPhone = passengerPhone;
        this.driverName = driverName;
        this.driverPhone = driverPhone;
        this.Complaint = Complaint;
    }

    public String getPassengerPhone() {
        return passengerPhone;
    }

    public void setPassengerPhone(String passengerPhone) {
        this.passengerPhone = passengerPhone;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverPhone() {
        return driverPhone;
    }

    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone;
    }

    public String getComplaint() {
        return Complaint;
    }

    public void setComplaint(String Complaint) {
        this.Complaint = Complaint;
    }
}
