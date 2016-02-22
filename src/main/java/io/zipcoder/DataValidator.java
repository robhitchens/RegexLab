package io.zipcoder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by roberthitchens3 on 2/21/16.
 */
public class DataValidator {

    public static boolean isValidUsername(String username){
        String pattern = "^[a-z]{3,25}$";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(username);

        if (m.find()) {
            //System.out.println("Valid");
            return true;
        } else {
            //System.out.println("Invalid");
            return false;
        }
    }

}
