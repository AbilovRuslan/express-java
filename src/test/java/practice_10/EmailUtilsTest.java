package practice_10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EmailUtilsTest {
    boolean isValidEmail(String email) {
        return email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$");
    }

    //Корректные email: "test@example.com", "user.name@domain.co", "a@b.cc" → true
    @ParameterizedTest
    @ValueSource(strings = {"btest@example.com", "user.name@domain.co", "a@b.cc"})
    void testValidEmails(String email) {
        assertTrue(isValidEmail(email));
    }

    //Некорректные email: "bad@.com", "no-at-symbol", "@missing-user.com", "user@domain" → false
    @ParameterizedTest
    @ValueSource(strings = {"bad@.com", "no-at-symbol", "@missing-user.com", "user@domain",""})
    void testInvalidEmail(String email) {
        assertFalse(isValidEmail(email));
    }

    //Пустая строка: "" → false
    @Test
    void testNullEmail(){
        assertFalse(isValidEmail(null));
    }


}



