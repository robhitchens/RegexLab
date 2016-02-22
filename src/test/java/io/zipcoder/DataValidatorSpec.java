package io.zipcoder;

/**
 * Created by roberthitchens3 on 2/21/16.
 */
import org.junit.Test;
import static org.junit.Assert.*;
public class DataValidatorSpec {

    DataValidator dataValidator = new DataValidator();

    @Test
    public void isValidUserNameTest(){
        String name = "disco";
        boolean result = dataValidator.isValidUsername(name);
        assertTrue("username should be valid",result);
        name="Disco";
        result = dataValidator.isValidUsername(name);
        assertFalse("username should be invalid", result);
        name = "bo";
        result = dataValidator.isValidUsername(name);
        assertFalse("name should be invalid. is short",result);
        name = "bo1234";
        result = dataValidator.isValidUsername(name);
        assertFalse("name should be invalid contains numbers",result);
        name = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        result = dataValidator.isValidUsername(name);
        assertFalse("name should be invalid too long",result);
    }
    @Test
    public void isValidEnhancedUserNameTest(){
        String name = "disco";
        boolean result = dataValidator.isValidEnhancedUsername(name);
        assertTrue("username should be valid",result);
        name = "bo1234";
        result = dataValidator.isValidEnhancedUsername(name);
        assertTrue("name should be valid contains numbers",result);
        name = "bob_hitch";
        result = dataValidator.isValidEnhancedUsername(name);
        assertTrue(result);

        name="5johnny";
        result=dataValidator.isValidEnhancedUsername(name);
        assertFalse(result);
        name = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        result = dataValidator.isValidEnhancedUsername(name);
        assertFalse("name should be invalid too long",result);
        name = "bo";
        result = dataValidator.isValidEnhancedUsername(name);
        assertFalse("name should be invalid. is short",result);
        name="Disco";
        result = dataValidator.isValidEnhancedUsername(name);
        assertFalse("username should be invalid", result);
    }
    @Test
    public void isValidIpTest(){
        String ip = "255.255.255.255";
        boolean result = dataValidator.isValidIP(ip);
        assertTrue("ip should be valid", result);
        ip = "192.12.5.200";
        result = dataValidator.isValidIP(ip);
        assertTrue("ip should be valid", result);
        ip = "1234.3.5678.9";
        result = dataValidator.isValidIP(ip);
        assertFalse("ip should be invalid", result);
        ip ="I.Am.not.an.ip";
        result = dataValidator.isValidIP(ip);
        assertFalse("ip should be invalid", result);
        ip = "666.666.666.666";
        result = dataValidator.isValidIP(ip);
        assertFalse("ip hsould be invalid", result);
    }
}
