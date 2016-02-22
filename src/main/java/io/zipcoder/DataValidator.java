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
            return true;
        } else {
            return false;
        }
    }
    public static boolean isValidEnhancedUsername(String username){
        String pattern = "^[a-z][a-z0-9_]{2,24}$";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(username);

        if (m.find()) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isValidIP(String ip){
        String zeroTo255 = "((25[0-5])|(2[0-4][0-9])|([0-1]?[0-9]?[0-9]))";
        String pattern= zeroTo255+"\\."+zeroTo255+"\\."+zeroTo255+"\\."+zeroTo255;
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(ip);
        if(m.find()){
            return true;
        }else{
            return false;
        }
    }
    public static String isPalindromeUsingRegex(String palindrome){
        return "it is impossible using regular regex";
    }


}
