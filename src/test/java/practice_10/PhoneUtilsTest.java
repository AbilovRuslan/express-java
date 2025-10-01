package practice_10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PhoneUtilsTest {
    public boolean isValidPhoneNumber(String phone) {
        return phone.matches("\\+\\d{1,3} \\d{10}");
    }
    //корректный номер
    @ParameterizedTest
    @ValueSource(strings = {"+1 1234567890","+44 9876543210","+999 1111111111"})
    void testValidPhones(String phone){
        assertTrue(isValidPhoneNumber(phone));
    }

    //некорректный номер
    @ParameterizedTest
    @ValueSource(strings = {"12345","invalid","+1 abcdefghij","+1234 1234567890","+1 123",""})
    void testInvalidPhones(String phone){
        assertFalse(isValidPhoneNumber(phone));
    }


}
