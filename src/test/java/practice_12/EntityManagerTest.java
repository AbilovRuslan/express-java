package practice_12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice_12.Entity.EntityManager;
import practice_12.Entity.User;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Тесты для EntityManager.
 * Проверяем добавление, удаление, фильтрацию и очистку коллекции.
 */
class EntityManagerTest {

    private EntityManager manager;

    @BeforeEach
    void setUp() {
        manager = new EntityManager();
        manager.add(new User("Alice", 25, true));
        manager.add(new User("Bob", 30, false));
        manager.add(new User("Charlie", 28, true));
        manager.add(new User("Anna", 20, true));
    }

    @Test
    void testAddAndGetAll() {
        List<User> all = manager.getAll();

        assertEquals(4, all.size(), "Должно быть 4 пользователя");
        assertTrue(all.stream().anyMatch(u -> u.getName().equals("Alice")));
    }

    @Test
    void testRemoveExistingUser() {
        boolean removed = manager.remove(new User("Bob", 30, false));
        assertTrue(removed, "Пользователь Bob должен быть удалён");

        List<User> remaining = manager.getAll();
        assertEquals(3, remaining.size(), "После удаления должно остаться 3 пользователя");
        assertFalse(remaining.stream().anyMatch(u -> u.getName().equals("Bob")));
    }

    @Test
    void testRemoveNonExistingUser() {
        boolean removed = manager.remove(new User("Noname", 99, false));
        assertFalse(removed, "Удаление несуществующего пользователя должно вернуть false");
    }

    @Test
    void testFilterByAge() {
        List<User> result = manager.filterByAge(20, 25);

        assertEquals(2, result.size(), "Должно быть 2 пользователя в диапазоне 20–25");
        assertTrue(result.stream().allMatch(u -> u.getAge() >= 20 && u.getAge() <= 25));
    }

    @Test
    void testFilterByName() {
        List<User> result = manager.filterByName("a"); // ищем "a" без учёта регистра

        assertEquals(3, result.size(), "Должно быть 3 пользователя с 'a' в имени");
        assertTrue(result.stream().allMatch(u -> u.getName().toLowerCase().contains("a")));
    }

    @Test
    void testFilterByActive() {
        List<User> active = manager.filterByActive(true);
        List<User> inactive = manager.filterByActive(false);

        assertEquals(3, active.size(), "Должно быть 3 активных пользователя");
        assertEquals(1, inactive.size(), "Должен быть 1 неактивный пользователь");
        assertTrue(active.stream().allMatch(User::isActive));
        assertTrue(inactive.stream().noneMatch(User::isActive));
    }

    @Test
    void testClearAndIsEmpty() {
        manager.clear();
        assertTrue(manager.isEmpty(), "После очистки список должен быть пуст");
        assertEquals(0, manager.size(), "Размер должен быть 0 после очистки");
    }

    @Test
    void testFilterCustomPredicate() {
        // Проверим универсальный фильтр: все старше 25 и неактивные
        List<User> result = manager.filter(u -> u.getAge() > 25 && !u.isActive());
        assertEquals(1, result.size());
        assertEquals("Bob", result.get(0).getName());
    }
}
