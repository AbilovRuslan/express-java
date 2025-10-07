package practice_12.Entity;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * EntityManager — менеджер для управления объектами User.
 * Потокобезопасность не гарантируется, но реализована защита от мутаций извне.
 * Поддерживает добавление, удаление, фильтрацию и базовые операции коллекции.
 */
public class EntityManager {

    // Хранилище пользователей
    private final List<User> users = new ArrayList<>();

    /**
     * Добавляет пользователя, если он не null.
     */
    public void add(User user) {
        if (user != null) {
            users.add(user);
        }
    }

    /**
     * Удаляет пользователя по equals().
     * Возвращает true, если пользователь найден и удалён.
     */
    public boolean remove(User user) {
        return users.remove(user);
    }

    /**
     * Возвращает все пользователи (копию списка, чтобы нельзя было испортить оригинал).
     */
    public List<User> getAll() {
        return new ArrayList<>(users);
    }

    /**
     * Универсальный фильтр по условию (Predicate<User>).
     * Позволяет строить любые кастомные выборки.
     */
    public List<User> filter(Predicate<User> condition) {
        return users.stream()
                .filter(condition)
                .collect(Collectors.toList());
    }

    /**
     * Фильтрует пользователей по возрасту (включительно).
     */
    public List<User> filterByAge(int min, int max) {
        return users.stream()
                .filter(u -> u.getAge() >= min && u.getAge() <= max)
                .collect(Collectors.toList());
    }

    /**
     * Фильтрует пользователей по вхождению имени (без учёта регистра).
     */
    public List<User> filterByName(String part) {
        if (part == null || part.isBlank()) return Collections.emptyList();

        String pattern = part.trim().toLowerCase();

        return users.stream()
                .filter(u -> u.getName() != null &&
                        u.getName().toLowerCase().contains(pattern))
                .collect(Collectors.toList());
    }

    /**
     * Фильтрует пользователей по активности.
     */
    public List<User> filterByActive(boolean active) {
        return users.stream()
                .filter(u -> u.isActive() == active)
                .collect(Collectors.toList());
    }

    /**
     * Возвращает количество пользователей.
     */
    public int size() {
        return users.size();
    }

    /**
     * Проверяет, пуст ли список.
     */
    public boolean isEmpty() {
        return users.isEmpty();
    }

    /**
     * Полностью очищает коллекцию пользователей.
     */
    public void clear() {
        users.clear();
    }
}
