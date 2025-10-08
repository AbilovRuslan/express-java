package practice_12.TaskManager;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void testTaskCreation() {
        LocalDateTime now = LocalDateTime.now();
        Task<Integer> task = new Task<>(1, Status.NEW, Priority.HIGH, now);

        assertEquals(1, task.getId());
        assertEquals(Status.NEW, task.getStatus());
        assertEquals(Priority.HIGH, task.getPriority());
        assertEquals(now, task.getCreatedAt());
    }

    @Test
    void testTaskCreationWithNullId() {
        LocalDateTime now = LocalDateTime.now();

        assertThrows(IllegalArgumentException.class, () ->
                new Task<>(null, Status.NEW, Priority.HIGH, now)
        );
    }

    @Test
    void testTaskEquality() {
        LocalDateTime now = LocalDateTime.now();
        Task<Integer> task1 = new Task<>(1, Status.NEW, Priority.HIGH, now);
        Task<Integer> task2 = new Task<>(1, Status.IN_PROGRESS, Priority.LOW, now);

        assertEquals(task1, task2);
        assertEquals(task1.hashCode(), task2.hashCode());
    }

    @Test
    void testTaskInequality() {
        LocalDateTime now = LocalDateTime.now();
        Task<Integer> task1 = new Task<>(1, Status.NEW, Priority.HIGH, now);
        Task<Integer> task2 = new Task<>(2, Status.NEW, Priority.HIGH, now);

        assertNotEquals(task1, task2);
    }

    @Test
    void testTaskComparison() {
        LocalDateTime earlier = LocalDateTime.now().minusDays(1);
        LocalDateTime later = LocalDateTime.now();

        Task<Integer> task1 = new Task<>(1, Status.NEW, Priority.HIGH, earlier);
        Task<Integer> task2 = new Task<>(2, Status.NEW, Priority.HIGH, later);

        assertTrue(task1.compareTo(task2) < 0);
        assertTrue(task2.compareTo(task1) > 0);
    }

    @Test
    void testTaskToString() {
        LocalDateTime now = LocalDateTime.of(2024, 1, 1, 10, 0);
        Task<Integer> task = new Task<>(1, Status.NEW, Priority.HIGH, now);

        String result = task.toString();
        assertTrue(result.contains("id=1"));
        assertTrue(result.contains("status=NEW"));
        assertTrue(result.contains("priority=HIGH"));
        assertTrue(result.contains("createdAt=2024-01-01T10:00"));
    }

    @Test
    void testSetters() {
        LocalDateTime now = LocalDateTime.now();
        Task<Integer> task = new Task<>(1, Status.NEW, Priority.HIGH, now);

        task.setStatus(Status.IN_PROGRESS);
        task.setPriority(Priority.MEDIUM);

        assertEquals(Status.IN_PROGRESS, task.getStatus());
        assertEquals(Priority.MEDIUM, task.getPriority());
    }
}