/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UBER;

import UBER.User;

/**
 *
 * @author USER
 */
public interface Chain {

    public void setNextChain(Chain nextChain);

    public String check(User user);

    // return "done" => if no, create a new passenger object with the given attributes and add it to hash table
    // return "emailNotValid" => check email validation
    // return "emailExists" => check if email are already taken if yes, display a message that the email is already in use
    // return "passwordNotValid" = >check password validation
    // return "phoneExists" => check if phone number are already taken if yes, display a message that the phone number is already in use
}
