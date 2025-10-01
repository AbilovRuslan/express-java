package practice_7;

public class AgeValidator {

    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(25);
            checkAge(-5);
            checkAge(200);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Некорректный возраст: " + age + ". Возраст должен быть от 0 до 150 лет.");
        }
        System.out.println("Возраст корректен: " + age + " лет");
    }
}