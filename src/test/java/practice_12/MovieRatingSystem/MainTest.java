package practice_12.MovieRatingSystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void main_ShouldExecuteWithoutErrors() {
        // Просто проверяем что main выполняется без исключений
        assertDoesNotThrow(() -> Main.main(new String[]{}));
    }

    @Test
    void main_DemoData_ShouldCalculateCorrectAverages() {
        // Given - создаем сервис и фильмы как в main
        MovieService movieService = new MovieService();
        Movie saw = new Movie("The Saw", "Horror", 2010);
        Movie hours = new Movie("The Hours", "Drama", 2000);
        Movie titanic = new Movie("The Titanic", "Drama", 1998);

        // When - добавляем оценки как в main
        movieService.addRating(saw, new Rating<>(9));
        movieService.addRating(saw, new Rating<>(8));
        movieService.addRating(saw, new Rating<>(7));

        movieService.addRating(hours, new Rating<>(8.5));
        movieService.addRating(hours, new Rating<>(8));
        movieService.addRating(hours, new Rating<>(6));

        movieService.addRating(titanic, new Rating<>(10));
        movieService.addRating(titanic, new Rating<>(9.5));
        movieService.addRating(titanic, new Rating<>(9));

        // Then - проверяем основные расчеты
        assertEquals(8.0, movieService.getAverageRating(saw), 0.01);   // (9+8+7)/3
        assertEquals(7.5, movieService.getAverageRating(hours), 0.01); // (8.5+8+6)/3
        assertEquals(9.5, movieService.getAverageRating(titanic), 0.01); // (10+9.5+9)/3

        assertEquals(3, movieService.getRatingCount(saw));
        assertEquals(3, movieService.getRatingCount(hours));
        assertEquals(3, movieService.getRatingCount(titanic));
    }
}