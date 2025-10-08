package practice_12.MovieRatingSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MovieServiceTest {

    private MovieService movieService;
    private Movie titanic;
    private Movie saw;

    @BeforeEach
    void setUp() {
        movieService = new MovieService();
        titanic = new Movie("Titanic", "Drama", 1997);
        saw = new Movie("The Saw", "Horror", 2004);
    }

    @Test
    void addRating_ValidRating_ShouldAddRating() {
        Rating<Integer> rating = new Rating<>(8);

        movieService.addRating(titanic, rating);

        assertEquals(8.0, movieService.getAverageRating(titanic));
        assertEquals(1, movieService.getRatingCount(titanic));
    }

    @Test
    void addRating_RatingBelowOne_ShouldThrowException() {
        Rating<Integer> invalidRating = new Rating<>(0);

        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> movieService.addRating(titanic, invalidRating));

        assertEquals("Оценка должна быть от 1 до 10", exception.getMessage());
    }

    @Test
    void addRating_RatingAboveTen_ShouldThrowException() {
        Rating<Integer> invalidRating = new Rating<>(11);

        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> movieService.addRating(titanic, invalidRating));

        assertEquals("Оценка должна быть от 1 до 10", exception.getMessage());
    }

    @Test
    void getAverageRating_NoRatings_ShouldReturnZero() {
        assertEquals(0.0, movieService.getAverageRating(titanic));
    }

    @Test
    void getAverageRating_MultipleRatings_ShouldCalculateCorrectAverage() {
        movieService.addRating(titanic, new Rating<>(8));
        movieService.addRating(titanic, new Rating<>(9));
        movieService.addRating(titanic, new Rating<>(7));

        double average = movieService.getAverageRating(titanic);

        assertEquals(8.0, average); // (8+9+7)/3 = 8.0
    }

    @Test
    void getRatingCount_NoRatings_ShouldReturnZero() {
        assertEquals(0, movieService.getRatingCount(titanic));
    }

    @Test
    void getRatingCount_WithRatings_ShouldReturnCorrectNumber() {
        movieService.addRating(titanic, new Rating<>(8));
        movieService.addRating(titanic, new Rating<>(9));

        assertEquals(2, movieService.getRatingCount(titanic));
    }

    @Test
    void getMovieSortedByPopularity_ShouldSortByRatingCountDescending() {
        movieService.addRating(titanic, new Rating<>(8)); // 1 оценка
        movieService.addRating(saw, new Rating<>(9)); // 1 оценка
        movieService.addRating(saw, new Rating<>(10)); // 2 оценки

        List<Movie> sortedMovies = movieService.getMovieSortedByPopularity();

        assertEquals("The Saw", sortedMovies.get(0).getTitle()); // 2 оценки
        assertEquals("Titanic", sortedMovies.get(1).getTitle()); // 1 оценка
    }

    @Test
    void addRating_DifferentMovies_ShouldKeepRatingsSeparate() {
        movieService.addRating(titanic, new Rating<>(8));
        movieService.addRating(saw, new Rating<>(10));

        assertEquals(8.0, movieService.getAverageRating(titanic));
        assertEquals(10.0, movieService.getAverageRating(saw));
        assertEquals(1, movieService.getRatingCount(titanic));
        assertEquals(1, movieService.getRatingCount(saw));
    }
}