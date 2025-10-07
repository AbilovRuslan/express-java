package practice_12.Validator;

// Класс для валидации объекта User
public class UserValidator {
    // Флаг: нужно ли проверять имя
    private final boolean validateName;

    // Конструктор, принимающий флаг проверки имени
    public UserValidator(boolean validateName) {
        this.validateName = validateName; // сохраняем флаг в поле класса
    }

    // Основной метод валидации, бросает InvalidUserException при ошибках
    public void validate(User user) throws InvalidUserException {
        if (validateName) { // если нужно проверять имя
            validateName(user); // вызываем метод проверки имени
        }
        validateAge(user);   // проверяем возраст
        validateEmail(user); // проверяем email
    }

    // Проверка имени: не пустое и с заглавной буквы
    private void validateName(User user) throws InvalidUserException {
        String name = user.getName(); // получаем имя пользователя
        if (name == null || name.isEmpty()) { // если имя null или пустое
            throw new InvalidUserException("name", "Имя не может быть пустым!"); // бросаем исключение
        }
        if (!Character.isUpperCase(name.charAt(0))) { // если первый символ не заглавная буква
            throw new InvalidUserException("name",
                    String.format("Имя должно быть с заглавной буквы! Текущее имя: %s", name));
            // бросаем исключение, показывая текущее имя
        }
    }

    // Проверка возраста: допустимы значения от 18 до 100
    private void validateAge(User user) throws InvalidUserException {
        int age = user.getAge(); // получаем возраст пользователя
        if (age < 18) { // если возраст меньше минимального
            throw new InvalidUserException("age", "Возраст не может быть меньше 18! Текущий возраст: " + age);
        }
        if (age > 100) { // если возраст больше максимального
            throw new InvalidUserException("age", "Возраст не может быть больше 100! Текущий возраст: " + age);
        }
    }

    // Проверка email: должен содержать @ и точку после него
    private void validateEmail(User user) throws InvalidUserException {
        String email = user.getEmail(); // получаем email пользователя
        // проверяем соответствие шаблону: что есть текст + @ + текст + . + минимум 2 буквы
        if (email == null || !email.matches("^[\\w-.]+@[\\w-]+\\.[a-zA-Z]{2,}$")) {
            throw new InvalidUserException("email", "Email имеет некорректный формат: " + email);
            // бросаем исключение с указанием некорректного email
        }
    }
}
