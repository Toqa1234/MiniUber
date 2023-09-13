/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UBER;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author USER
 */
public class EmailValidator implements Chain {
    // Define a simple regex for email validation

    private static final String EMAIL_REGEX = "^(.+)@([a-z0-9-]+\\.)+[a-z]{2,}$";
    // Create a Pattern object from the regex
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);
    private Chain nextChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public String check(User user) {
        if (validateEmail(user.getEmail())) {

            if (nextChain != null) {
                return nextChain.check(user);
            } else {
                // If there is no next handler, return done
                return "done";
            }
        }
        return "emailNotValid";
    }

    public static boolean validateEmail(String email) {

        Matcher matcher = EMAIL_PATTERN.matcher(email);

        return matcher.matches();

    }

}
