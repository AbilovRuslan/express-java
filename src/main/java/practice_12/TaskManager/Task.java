package practice_12.TaskManager;

import java.time.LocalDateTime;
import java.util.Objects;

public class Task<T> implements Comparable<Task<T>> {
    private final T id;
    private final LocalDateTime createdAt;
    private Status status;
    private Priority priority;

    public Task(T id, Status status, Priority priority, LocalDateTime createdAt) {
        if (id == null) {
            throw new IllegalArgumentException("ID не может быть null");
        }
        this.id = id;
        this.status = status;
        this.priority = priority;
        this.createdAt = createdAt;
    }

    public T getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    @Override
    public int compareTo(Task<T> other) {
        return this.createdAt.compareTo(other.createdAt);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task<?> task = (Task<?>) o;
        return id.equals(task.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Task{" + "id=" + id + ", status=" + status + ", priority=" + priority + ", createdAt=" + createdAt + '}';
    }
}