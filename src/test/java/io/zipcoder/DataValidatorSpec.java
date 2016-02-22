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
    }
}
