package practice_7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    static class InvalidEmailException extends RuntimeException {
        public InvalidEmailException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        try {
            EmailValidator.validateEmail("test@test.com");
            System.out.println("valid email");
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }
        try {
            EmailValidator.validateEmail("wrong-email");
            System.out.println("valid email");
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validateEmail(String email) {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (!matcher.matches()) {
            throw new InvalidEmailException("Некорректный адрес: " + email);
        }
    }
}