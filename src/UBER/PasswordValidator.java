/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UBER;

/**
 *
 * @author USER
 */
public class PasswordValidator implements Chain {

    private Chain nextChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public String check(User user) {
        if (checkPassword(user.getPassword(), user.getconfirmPassword())) {

            {
                if (nextChain != null) {
                    return nextChain.check(user);
                } else {
                    return "done"; //return done if password and confirm password are equal.
                }
            }
        }
        return "passwordNotValid";      //return passwordNotValid if password and confirm password are not equal or not in the valid length range
    }

    private boolean checkPassword(String password, String confirmPassword) {
        // Return true if password and confirm password are equal and in the valid length range
        if ((password.length() >= 8 && password.length() <= 16)) {
            if (password.equals(confirmPassword)) {
                return true;
            }
        }
        return false;
    }
}
