// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
package UBER;

import static UBER.SavingData.passengers;
import static UBER.SavingData.drivers;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import static UBER.SavingData.complaints;

/**
 *
 * @author dell
 */
public class Data {

//    public void saveHashtable() {
//    // Iterate over the values of the hashtable
////    for (Passenger p : passengers.values()) {
////      // Insert each driver into the database
////      System.out.println(p.getEmail());
////      database(p);
////    }
//    
//    }
    private Data() {

    }

    private volatile static Data dataInstance = null;

    public static Data getInstance() {
        Data Client = dataInstance;
        if (Client == null) {
            synchronized (Data.class) {
                Client = dataInstance;
                if (Client == null) {
                    Client = dataInstance = new Data();
                }
            }
        }
        return Client;
    }

    public void SetInDatabase(String username, String email, String password, String phoneNumber, String role,
            String license, String vehicleType, String vehicleModel, String vehicleColor, String vehiclePlate) {

        Connection con;
        ResultSet rs;
        Statement st;

        try {
            String host = "jdbc:mysql://localhost:3306/mini-uber";
            String uName = "root";
            String uPass = "toqa@osama123";
            con = DriverManager.getConnection(host, uName, uPass);
            st = con.createStatement();

            String sql = "INSERT INTO  passenger(phone,email,name,password,role)VALUES(?,?,?,?,?)";
            if (role.equals("driver")) {
                sql = "INSERT INTO drivers (phoneNumber,email,username,password,role,license,vehicleType,"
                        + "vehicleModel,vehicleColor,vehiclePlate,rate)VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            }

            PreparedStatement pstmt = con.prepareStatement(sql);
// Set the values for the placeholders
            pstmt.setString(1, phoneNumber); // phone
            pstmt.setString(2, email); // email
            pstmt.setString(3, username); // name
            pstmt.setString(4, password); // password
            pstmt.setString(5, role); // role
            if (role.equals("driver")) {

                pstmt.setString(6, license); // phone
                pstmt.setString(7, vehicleType); // email
                pstmt.setString(8, vehicleModel); // name
                pstmt.setString(9, vehicleColor); // password
                pstmt.setString(10, vehiclePlate); //  
                pstmt.setDouble(11, 1);
            }
// Execute the query and get the number of affected rows
            int rows = pstmt.executeUpdate();

            st.close();
            con.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage());

        }
    }

//    public void saveHashtable() {
//        Iterate over the values of the hashtable
//    for (Passenger p : passengers.values()) {
//      // Insert each driver into the database
//      System.out.println(p.getEmail());
//      database(p);
//    }
    public void SetComplaintInDatabase(Ticket ticketdata) {

        Connection con;
        ResultSet rs;
        Statement st;

        try {
            String host = "jdbc:mysql://localhost:3306/mini-uber";
            String uName = "root";
            String uPass = "toqa@osama123";
            con = DriverManager.getConnection(host, uName, uPass);
            st = con.createStatement();

            String sql = "INSERT INTO complaints (passengerPhone,driverPhone,driverName,complaint)VALUES(?,?,?,?)";
// Create a PreparedStatement object
            PreparedStatement pstmt = con.prepareStatement(sql);
// Set the values for the placeholders
            pstmt.setString(1, ticketdata.getPassengerPhone());
            pstmt.setString(2, ticketdata.getDriverPhone());
            pstmt.setString(3, ticketdata.getDriverName());
            pstmt.setString(4, ticketdata.getComplaint());
// Execute the query and get the number of affected rows
            int rows = pstmt.executeUpdate();

            st.close();
            con.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage());

        }
    }

    public void GetFromDatabase() {

        Connection con;
        ResultSet rs;
        Statement st;
        try {
            String host = "jdbc:mysql://localhost:3306/mini-uber";
            String uName = "root";
            String uPass = "toqa@osama123";
            con = DriverManager.getConnection(host, uName, uPass);
            st = con.createStatement();

            String sql = "SELECT * FROM `mini-uber`.passenger";
            rs = st.executeQuery(sql);

            while (rs.next()) {

                Passenger p = new Passenger(rs.getString("phone"), rs.getString("email"),
                        rs.getString("name"), rs.getString("password"), rs.getString("role"));

                passengers.put(rs.getString("phone"), p);
            }

            sql = "SELECT * FROM `mini-uber`.drivers";
            rs = st.executeQuery(sql);
            while (rs.next()) {

                Driver d = new Driver(rs.getString("username"), rs.getString("email"), rs.getString("password"),
                        rs.getString("phoneNumber"), rs.getString("role"), rs.getString("license"),
                        rs.getString("vehicleType"), rs.getString("vehicleModel"),
                        rs.getString("vehicleColor"), rs.getString("vehiclePlate"));

                drivers.put(rs.getString("phoneNumber"), d);
            }
            // Put the values in the hashtable
            rs.close();
            st.close();
            con.close();

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage());
        }
    }

    public void GetcomplaintFromDatabase() {

        Connection con;
        ResultSet rs;
        Statement st;
        try {

            String host = "jdbc:mysql://localhost:3306/mini-uber";
            String uName = "root";
            String uPass = "toqa@osama123";
            con = DriverManager.getConnection(host, uName, uPass);
            st = con.createStatement();

            String sql = "SELECT * FROM `mini-uber`.complaints";
            rs = st.executeQuery(sql);
            while (rs.next()) {

                Ticket ticketInf = new Ticket(rs.getString("passengerPhone"), rs.getString("driverName"),
                        rs.getString("driverPhone"), rs.getString("complaint"));

                complaints.add(ticketInf);
            }

            // Put the values in the hashtable
            rs.close();
            st.close();
            con.close();

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage());
        }
    }

}

//          for (Passenger p : passengers.values()) {
//      // Insert each driver into the database
//      System.out.println(p.getEmail());
//    //  database(p);
//         
//          
//          rs.next();
//          }
