package practice_12.Validator;

public class Main {
    public static void main(String[] args) {
        // Создаем валидатор пользователей, указываем, что проверяем имя
        UserValidator validator = new UserValidator(true);

        // Создаем корректного пользователя
        User validUser = new User("Anna", 23, "anna@blabla.com");
        // Создаем пользователя с ошибками: имя с маленькой буквы, email без @
        User invalidUser = new User("bob", 55, "bobsick.com");

        try {
            // Проверяем валидного пользователя
            validator.validate(validUser);
            // Если ошибок нет, выводим сообщение о прохождении валидации
            System.out.println("Валидация прошла: " + validUser);

            // Проверяем некорректного пользователя
            validator.validate(invalidUser);
            // Если исключение не выброшено (что не должно быть), выводим предупреждение
            System.out.println("Валидация не прошла (ожидалось исключение)");
        } catch (InvalidUserException e) {
            // Если выброшено исключение, выводим информацию об ошибке
            System.out.printf(
                    "Ошибка в поле '%s': %s%n",
                    e.getFieldName(),  // возвращает имя поля, вызвавшего ошибку (например, "name")
                    e.getMessage()     // возвращает текст ошибки с деталями (например, конкретное имя)
            );
        }

        // Сообщение о завершении проверки
        System.out.println("Проверка окончена");
    }
}
