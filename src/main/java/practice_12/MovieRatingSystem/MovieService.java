package practice_12.MovieRatingSystem;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class MovieService {
    private final Map<Movie, List<Rating<? extends Number>>> movieRatings = new ConcurrentHashMap<>();

    //добавляем оценки к кино
    public synchronized <T extends Number> void addRating(Movie movie, Rating<T> rating) {
        double value = rating.getValue().doubleValue();
        if (value < 1 || value > 10) {
            throw new IllegalArgumentException("Оценка должна быть от 1 до 10");
        }
        //если фильма нет в Map, добавляем новую запись с пустым списком
        movieRatings.computeIfAbsent(movie, m -> new CopyOnWriteArrayList<>()).add(rating);
    }

    public double getAverageRating(Movie movie) {
        List<Rating<? extends Number>> ratings = movieRatings.get(movie);
        // Если оценок нет — возвращаем 0.0
        if (ratings == null || ratings.isEmpty()) {
            return 0.0;
        }
        //превращаем оценки в поток чисел, вычисляем среднее значение
        return ratings.stream()
                .mapToDouble(r -> r.getValue().doubleValue())
                .average()
                .orElse(0.0);
    }

    //Получение количества оценок
    public int getRatingCount(Movie movie) {
        return movieRatings.getOrDefault(movie, List.of()).size();
    }

    //cортировка по средней оценке
    public List<Movie> getMovieSortedByPopularity() {
        return movieRatings.keySet().stream()
                .sorted((m1, m2) -> Integer.compare(getRatingCount(m2), getRatingCount(m1)))
                .collect(Collectors.toList());
    }

    //выводим список фильмов и оценки
    public void printAllMovies() {
        movieRatings.forEach((movie, ratings) -> {
            System.out.printf("%s — Средняя: %.2f, Оценок: %d%n",
                    movie.getTitle(), getAverageRating(movie), ratings.size());
        });
    }


}
