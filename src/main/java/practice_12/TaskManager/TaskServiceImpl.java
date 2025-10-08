package practice_12.TaskManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TaskServiceImpl<T> implements TaskService<T> {

    private final List<Task<T>> tasks = new ArrayList<>();

    @Override
    public boolean addTask(Task<T> task) {
        Optional<Task<T>> existing = tasks.stream()
                .filter(t -> t.getId().equals(task.getId()))
                .findFirst();

        if (existing.isPresent()) {
            return false;
        }
        return tasks.add(task);
    }

    @Override
    public synchronized boolean removeTask(T id) {
        return tasks.removeIf(t -> t.getId().equals(id));
    }

    @Override
    public List<Task<T>> findByStatus(Status status) {
        return tasks.stream()
                .filter(t -> t.getStatus() == status)
                .toList();
    }

    @Override
    public List<Task<T>> findByPriority(Priority priority) {
        return tasks.stream()
                .filter(t -> t.getPriority() == priority)
                .toList();
    }

    @Override
    public List<Task<T>> getAllSortedByDate(boolean ascending) {
        return tasks.stream()
                .sorted((t1, t2) -> ascending
                        ? t1.getCreatedAt().compareTo(t2.getCreatedAt())
                        : t2.getCreatedAt().compareTo(t1.getCreatedAt()))
                .toList();
    }
}