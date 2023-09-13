/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UBER;

import static UBER.SavingData.complaints;
import static UBER.SavingData.drivers;
import static UBER.SavingData.requests;

/**
 *
 * @author USER
 */
public class Passenger extends User {

    public Passenger(String username, String email, String password, String confirmPassword, String phoneNumber, String role) {
        super(username, email, password, confirmPassword, phoneNumber, "passenger");

    }
// implementation for register

    public Passenger(String phoneNumber, String email, String password, String type) {

        super(phoneNumber, email, password, type);
    }

    public Passenger(String phoneNumber, String email, String name, String password, String type) {
        super(phoneNumber, email, name, password, type);
    }

    public boolean SupportTicket(String passengerPhone, String driverName, String driverPhone, String Complaint) {

        if (drivers.containsKey(driverPhone)) {
            if (drivers.get(driverPhone).getUsername().equals(driverName)) {
                Ticket complaint = new Ticket(passengerPhone, driverName, driverPhone, Complaint);
                complaints.add(complaint);

                Data complaintData;
                complaintData = Data.getInstance();
                complaintData.SetComplaintInDatabase(complaint);

                return true;
            }
        }
        return false;
    }

    public double MakeReq(Request r, String PassPhoneNum) {

        RideFactory RF = new RideFactory();
        PayFactory PF = new PayFactory();

        PayTypeContext PC = PayTypeContext.getInstance();
        PC.setPTStrateg(PF.createPayType(r.getPayType()));
        PC.payment();

        RideTypeContext RC = RideTypeContext.getInstance();
        RC.setStrategy(RF.createType(r.getRideType()));
        double totalprice = RC.setPrice(r);
        r.setRequestprice(totalprice);

        return totalprice;
    }

    public void ConfirmRequest(Request r) {
        requests.add(r);
    }

    public void CancelRequest(String phoneNum) {

        for (int i = 0; i < requests.size(); i++) {
            if (requests.get(i).getPassengerPhoneNumber() == phoneNum) {
                requests.remove(i);
            }
        }

    }
}
