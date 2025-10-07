package practice_12.Entity;

import java.util.Objects;

public class User {
    private final String name;
    private final int age;
    private final boolean active;

    // Конструктор класса, инициализирует все поля при создании объекта
    public User(String name, int age, boolean active) {
        this.name = name;
        this.age = age;
        this.active = active;
    }

    // Геттер для поля name
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isActive() {
        return active;
    }


    // Переопределение метода toString для красивого отображения объекта в виде строки
    @Override
    public String toString() {
        return String.format("User{name='%s', age=%d, active=%s}", name, age, active);
    }

    // Переопределение метода equals для сравнения объектов по значению, а не по ссылке
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return age == user.age &&
                active == user.active &&
                Objects.equals(name, user.name);
    }

    // Переопределение hashCode для корректной работы коллекций, например HashMap
    @Override
    public int hashCode() {
        return Objects.hash(name, age, active);
    }
}
