package practice_12.TaskManager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaskServiceImplTest {

    private TaskService<Integer> taskService;
    private Task<Integer> task1;
    private Task<Integer> task2;
    private Task<Integer> task3;

    @BeforeEach
    void setUp() {
        taskService = new TaskServiceImpl<>();

        LocalDateTime baseTime = LocalDateTime.of(2024, 1, 1, 10, 0);
        task1 = new Task<>(1, Status.NEW, Priority.HIGH, baseTime);
        task2 = new Task<>(2, Status.IN_PROGRESS, Priority.MEDIUM, baseTime.plusHours(1));
        task3 = new Task<>(3, Status.DONE, Priority.LOW, baseTime.plusHours(2));
    }

    @Test
    void testAddTask() {
        assertTrue(taskService.addTask(task1));
        assertTrue(taskService.addTask(task2));
    }

    @Test
    void testAddDuplicateTask() {
        taskService.addTask(task1);

        // Попытка добавить задачу с тем же ID
        Task<Integer> duplicateTask = new Task<>(1, Status.DONE, Priority.LOW, LocalDateTime.now());
        assertFalse(taskService.addTask(duplicateTask));
    }

    @Test
    void testRemoveTask() {
        taskService.addTask(task1);
        taskService.addTask(task2);

        assertTrue(taskService.removeTask(1));
        assertFalse(taskService.removeTask(999)); // Несуществующий ID
    }

    @Test
    void testFindByStatus() {
        taskService.addTask(task1); // NEW
        taskService.addTask(task2); // IN_PROGRESS
        taskService.addTask(task3); // DONE

        List<Task<Integer>> newTasks = taskService.findByStatus(Status.NEW);
        assertEquals(1, newTasks.size());
        assertEquals(task1, newTasks.get(0));

        List<Task<Integer>> doneTasks = taskService.findByStatus(Status.DONE);
        assertEquals(1, doneTasks.size());
        assertEquals(task3, doneTasks.get(0));
    }

    @Test
    void testFindByPriority() {
        taskService.addTask(task1); // HIGH
        taskService.addTask(task2); // MEDIUM
        taskService.addTask(task3); // LOW

        List<Task<Integer>> highPriorityTasks = taskService.findByPriority(Priority.HIGH);
        assertEquals(1, highPriorityTasks.size());
        assertEquals(task1, highPriorityTasks.get(0));

        List<Task<Integer>> mediumPriorityTasks = taskService.findByPriority(Priority.MEDIUM);
        assertEquals(1, mediumPriorityTasks.size());
        assertEquals(task2, mediumPriorityTasks.get(0));
    }

    @Test
    void testGetAllSortedByDateAscending() {
        taskService.addTask(task3); // Самая поздняя
        taskService.addTask(task1); // Самая ранняя
        taskService.addTask(task2); // Средняя

        List<Task<Integer>> sorted = taskService.getAllSortedByDate(true);

        assertEquals(3, sorted.size());
        assertEquals(task1, sorted.get(0)); // Самая ранняя
        assertEquals(task2, sorted.get(1)); // Средняя
        assertEquals(task3, sorted.get(2)); // Самая поздняя
    }

    @Test
    void testGetAllSortedByDateDescending() {
        taskService.addTask(task1); // Самая ранняя
        taskService.addTask(task3); // Самая поздняя
        taskService.addTask(task2); // Средняя

        List<Task<Integer>> sorted = taskService.getAllSortedByDate(false);

        assertEquals(3, sorted.size());
        assertEquals(task3, sorted.get(0)); // Самая поздняя
        assertEquals(task2, sorted.get(1)); // Средняя
        assertEquals(task1, sorted.get(2)); // Самая ранняя
    }

    @Test
    void testEmptyService() {
        assertTrue(taskService.findByStatus(Status.NEW).isEmpty());
        assertTrue(taskService.findByPriority(Priority.HIGH).isEmpty());
        assertTrue(taskService.getAllSortedByDate(true).isEmpty());

        assertFalse(taskService.removeTask(1)); // Удаление из пустого сервиса
    }

    @Test
    void testConcurrentRemove() {
        taskService.addTask(task1);
        taskService.addTask(task2);

        // Тестируем synchronized метод
        assertTrue(taskService.removeTask(1));
        assertFalse(taskService.removeTask(1)); // Повторное удаление
    }
}