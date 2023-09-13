/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UBER;

import static UBER.SavingData.passengers;

/**
 *
 * @author dell
 */
public class CurrentUser {

    private String currentPhone;

    public String getCurrentPhone() {
        return currentPhone;
    }

    public void setCurrentPhone(String currentPhone) {
        this.currentPhone = currentPhone;
    }

    // The volatile keyword ensures that multiple threads
    // handle the uniqueInstance variable correctly 
    // when it is being initialized to the Singleton instance
    private CurrentUser() {
    }

    private volatile static CurrentUser userInstance = null;

    public static CurrentUser getInstance() {
        CurrentUser client = userInstance;

        if (client == null) {
            synchronized (CurrentUser.class) {
                client = userInstance;
                if (client == null) {
                    client = userInstance = new CurrentUser();
                }
            }
        }
        return client;
    }
}
