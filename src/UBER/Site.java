/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package UBER;
//import static UBER.SavingData.requests;
//import java.util.Scanner;
//import static UBER.SavingData.phoneDriver;
//import static UBER.SavingData.phonePassenger;
//import static UBER.SavingData.drivers;
//import static UBER.SavingData.passengers;

/**
 *
 * @author DELL
 */
//public class Site {
//        
//    SavingData s = new SavingData();
//    Passenger p1 = new Passenger("habiba", "habibakkdsbfkjd", "zxc123","zxc123", "0123456","Passenger"); 
//    Driver D1 = new Driver("AHMED", "Ahmed@gmail.com", "123abc","123abc", "01023456789","Driver");
//    
//
//    Site()
//    {
//Intro home = new Intro();    
//home .setVisible(true);
//    }
//    
////    void loop ()
////    {
////        Start();
////    }
//    
//    
//    void Start()
//    {
//        System.out.println("**********welcome to Uber**********");
//        System.out.println("Enter Passenger or Driver");
//        Scanner scanner = new Scanner(System.in);
//        String UserType = scanner.next();
//        switch(UserType)
//        {
//            case "Driver":
//             DriverOptions ();
//             break;
//             
//            case "Passenger":
//              PassengerOptions ();
//              break;
//              
//            default  :
//              System.out.println("worng choice");
//  
//                
//        }
//    }
//    
//    
//    void DriverOptions ()
//    {
//        
//        System.out.println("*****[1].View requests*****");
//        System.out.println("*****[2].View your current request*****");
//        System.out.println("*****[3].Choose request*****");
//        System.out.println("*****[4].Finish request*****");
//        System.out.println("Enter your choice");
//        
//        Scanner scanner1 = new Scanner(System.in);
//        int Driver_cho = scanner1.nextInt();
//        
//        
//        
//        switch(Driver_cho)
//        {
//            case 1:
//                D1.view_requests();
//                Start();
//                //drivers.get(phoneDriver).view_requests();
//                break;
//            case 3 :
//                D1.choose_req();
//                break;
//                
//            case 4 :
//                //D1.finishRide(p1.getPhoneNumber());
//                Start();
//                break;    
//            default  :
//                System.out.println("worng choice");
//        }
//
//    }
//    
//    
//    void PassengerOptions ()
//    {
//        
//        System.out.println("*****[1].Make request*****");
//        System.out.println("*****[2].View your current request*****");
//        System.out.println("*****[3].Cancel your request*****");
//        System.out.println("Enter your choice");
//        
//        Scanner scanner1 = new Scanner(System.in);
//        int Pass_cho = scanner1.nextInt();
//        
//    }
//
//        
////        switch(Pass_cho)
////        {
////            case 1:
////             p1.Make_req(p1.getPhoneNumber());
////             Start();
////             break;
////             
////            case 2:
////                viewdriverinfo();
////                Start();
////                break;
////            
////            case 3:
////                p1.CancelRequest(p1.getPhoneNumber());
////                Start();
////                break; 
////                
////            default  :
////             System.out.println("worng choice");
////
////        }
////        
////    }
//    
//    
////     public void viewdriverinfo ()//)
////     {
////         //System.out.println("your driver car color : "+D.getVehicleColor());
////         //System.out.println("your driver car : "+D.getVehicleType());
////        // System.out.println("your driver name : "+D.getUsername());
////         //System.out.println("your driver phone : "+D.getPhoneNumber());
////         System.out.println(drivers.get(phoneDriver).getPhoneNumber());
////         
////          for(int i=0;i<=requests.size()-1;i++){
////            if(requests.get(i).getPassengerPhoneNumber().equals(p1.getPhoneNumber())){
////                if(requests.get(i).FinshRide==true){
////                 p1.SupportTicket(requests.get(i).getPassengerPhoneNumber());
////                System.out.println("Support ticket called.");
////                }else{
////                    System.out.println(requests.get(i).FinshRide);
////                }
////            }
////        }
//     
//}