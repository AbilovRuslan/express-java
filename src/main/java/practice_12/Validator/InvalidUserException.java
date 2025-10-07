package practice_12.Validator;

// Класс собственного исключения для ошибок валидации User
// Наследуется от RuntimeException, чтобы быть unchecked исключением
public class InvalidUserException extends RuntimeException {

    // Поле, где хранится имя поля, вызвавшего ошибку (например: "name", "age", "email")
    private final String fieldName;

    // Конструктор, принимающий имя поля и сообщение ошибки
    public InvalidUserException(String fieldName, String message) {
        super(message); // передаем сообщение в родительский класс RuntimeException
        this.fieldName = fieldName; // сохраняем имя поля, где произошла ошибка
    }

    // Геттер для получения имени поля, вызвавшего исключение
    public String getFieldName() {
        return fieldName; // возвращаем имя поля
    }
}
