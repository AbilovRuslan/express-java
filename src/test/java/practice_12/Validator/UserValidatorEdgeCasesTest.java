package practice_12.Validator;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserValidatorEdgeCasesTest {

    @Test
    void ageBelowMinimumShouldThrow() {
        User user = new User("Alice", 17, "alice@example.com");
        UserValidator validator = new UserValidator(true);

        InvalidUserException exception = assertThrows(InvalidUserException.class,
                () -> validator.validate(user));
        assertEquals("age", exception.getFieldName());
        assertTrue(exception.getMessage().contains("Возраст"));
    }

    @Test
    void ageAboveMaximumShouldThrow() {
        User user = new User("Bob", 101, "bob@example.com");
        UserValidator validator = new UserValidator(true);

        InvalidUserException exception = assertThrows(InvalidUserException.class,
                () -> validator.validate(user));
        assertEquals("age", exception.getFieldName());
        assertTrue(exception.getMessage().contains("Возраст"));
    }

    @Test
    void validEdgeAgeShouldPass() {
        User user1 = new User("Eve", 18, "eve@example.com");
        User user2 = new User("Tom", 100, "tom@example.com");
        UserValidator validator = new UserValidator(true);

        assertDoesNotThrow(() -> validator.validate(user1));
        assertDoesNotThrow(() -> validator.validate(user2));
    }

    @Test
    void emailWithoutDotShouldThrow() {
        User user = new User("Charlie", 30, "charlie@com"); // допустим проверка только на @
        UserValidator validator = new UserValidator(true);

        InvalidUserException exception = assertThrows(InvalidUserException.class,
                () -> validator.validate(user));
        assertEquals("email", exception.getFieldName());
    }

    @Test
    void nullEmailShouldThrow() {
        User user = new User("David", 30, null);
        UserValidator validator = new UserValidator(true);

        InvalidUserException exception = assertThrows(InvalidUserException.class,
                () -> validator.validate(user));
        assertEquals("email", exception.getFieldName());
    }
}
