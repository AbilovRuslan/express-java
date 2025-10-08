package practice_12.TaskManager;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        TaskService<Integer> service = new TaskServiceImpl<>();

        // Упростите - используйте статический импорт
        Task<Integer> t1 = new Task<>(1, Status.NEW, Priority.HIGH, LocalDateTime.now().minusDays(1));
        Task<Integer> t2 = new Task<>(2, Status.IN_PROGRESS, Priority.MEDIUM, LocalDateTime.now());
        Task<Integer> t3 = new Task<>(3, Status.DONE, Priority.LOW, LocalDateTime.now().plusDays(1));

        service.addTask(t1);
        service.addTask(t2);
        service.addTask(t3);

        System.out.println("Все задачи (по возрастанию даты):");
        service.getAllSortedByDate(true).forEach(System.out::println);

        System.out.println("\nФильтр по статусу DONE:");
        service.findByStatus(Status.DONE).forEach(System.out::println);

        System.out.println("\nФильтр по приоритету HIGH:");
        service.findByPriority(Priority.HIGH).forEach(System.out::println);

        service.removeTask(2);
        System.out.println("\nПосле удаления задачи с ID = 2:");
        service.getAllSortedByDate(true).forEach(System.out::println);
    }
}