package practice_12.Validator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {

    @Test
    void validUserShouldPass() {
        User user = new User("Anna", 25, "anna@example.com");
        UserValidator validator = new UserValidator(true);
        assertDoesNotThrow(() -> validator.validate(user));
    }

    @Test
    void invalidNameShouldThrow() {
        User user = new User("bob", 25, "bob@example.com");
        UserValidator validator = new UserValidator(true);
        InvalidUserException e = assertThrows(InvalidUserException.class, () -> validator.validate(user));
        assertEquals("name", e.getFieldName());
        assertTrue(e.getMessage().contains("Имя должно быть с заглавной буквы"));
    }

    @Test
    void emptyNameShouldThrow() {
        User user = new User("", 25, "user@example.com");
        UserValidator validator = new UserValidator(true);
        InvalidUserException e = assertThrows(InvalidUserException.class, () -> validator.validate(user));
        assertEquals("name", e.getFieldName());
        assertTrue(e.getMessage().contains("не может быть пустым"));
    }

    @Test
    void ageBelowMinimumShouldThrow() {
        User user = new User("Alice", 17, "alice@example.com");
        UserValidator validator = new UserValidator(true);
        InvalidUserException e = assertThrows(InvalidUserException.class, () -> validator.validate(user));
        assertEquals("age", e.getFieldName());
        assertTrue(e.getMessage().contains("Возраст"));
    }

    @Test
    void ageAboveMaximumShouldThrow() {
        User user = new User("Bob", 101, "bob@example.com");
        UserValidator validator = new UserValidator(true);
        InvalidUserException e = assertThrows(InvalidUserException.class, () -> validator.validate(user));
        assertEquals("age", e.getFieldName());
        assertTrue(e.getMessage().contains("Возраст"));
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
    void invalidEmailShouldThrow() {
        User user = new User("Charlie", 30, "charlieexample.com");
        UserValidator validator = new UserValidator(true);
        InvalidUserException e = assertThrows(InvalidUserException.class, () -> validator.validate(user));
        assertEquals("email", e.getFieldName());
    }

    @Test
    void emailWithoutDotShouldThrow() {
        User user = new User("Charlie", 30, "charlie@com");
        UserValidator validator = new UserValidator(true);
        InvalidUserException e = assertThrows(InvalidUserException.class, () -> validator.validate(user));
        assertEquals("email", e.getFieldName());
    }

    @Test
    void nullEmailShouldThrow() {
        User user = new User("David", 30, null);
        UserValidator validator = new UserValidator(true);
        InvalidUserException e = assertThrows(InvalidUserException.class, () -> validator.validate(user));
        assertEquals("email", e.getFieldName());
    }

    @Test
    void validateNameDisabledShouldSkipNameCheck() {
        User user = new User("bob", 25, "bob@example.com");
        UserValidator validator = new UserValidator(false); // имя не валидируем
        assertDoesNotThrow(() -> validator.validate(user));
    }
}
