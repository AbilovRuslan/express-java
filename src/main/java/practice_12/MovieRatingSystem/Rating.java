package practice_12.MovieRatingSystem;

public class Rating<T extends Number> {
    private final T value;

    public Rating(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    //для удобного вывода
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
