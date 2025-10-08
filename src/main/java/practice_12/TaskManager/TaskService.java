package practice_12.TaskManager;

import java.util.List;

public interface TaskService<T> {

    boolean addTask(Task<T> task);

    boolean removeTask(T id);

    List<Task<T>> findByStatus(Status status);

    List<Task<T>> findByPriority(Priority priority);

    List<Task<T>> getAllSortedByDate(boolean ascending);
}