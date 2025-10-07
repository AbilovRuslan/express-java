package practice_12.Validator;

public class User {
    // Поле для имени пользователя
    private String name;
    // Поле для возраста пользователя
    private int age;
    // Поле для email пользователя
    private String email;

    // Конструктор класса, который инициализирует все поля
    public User(String name, int age, String email) {
        this.name = name;   // присваиваем имя
        this.age = age;     // присваиваем возраст
        this.email = email; // присваиваем email
    }

    // Геттер для имени пользователя
    public String getName() { return name; }
    // Геттер для возраста пользователя
    public int getAge() { return age; }
    // Геттер для email пользователя
    public String getEmail() { return email; }

    // Переопределяем метод toString, чтобы красиво выводить объект User
    @Override
    public String toString() {
        // Форматируем строку с полями объекта
        return String.format("User{name='%s', age=%d, email=%s}", name, age, email);
    }
}
