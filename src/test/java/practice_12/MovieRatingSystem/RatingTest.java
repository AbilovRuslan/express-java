package practice_12.MovieRatingSystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RatingTest {

    @Test
    void constructor_ShouldSetValue() {
        Rating<Integer> rating = new Rating<>(8);

        assertEquals(8, rating.getValue());
    }

    @Test
    void getValue_IntegerRating_ShouldReturnCorrectValue() {
        Rating<Integer> rating = new Rating<>(9);

        Integer value = rating.getValue();

        assertEquals(9, value);
    }

    @Test
    void getValue_DoubleRating_ShouldReturnCorrectValue() {
        Rating<Double> rating = new Rating<>(8.5);

        Double value = rating.getValue();

        assertEquals(8.5, value);
    }

    @Test
    void toString_IntegerRating_ShouldReturnStringValue() {
        Rating<Integer> rating = new Rating<>(7);

        String result = rating.toString();

        assertEquals("7", result);
    }

    @Test
    void toString_DoubleRating_ShouldReturnStringValue() {
        Rating<Double> rating = new Rating<>(9.5);

        String result = rating.toString();

        assertEquals("9.5", result);
    }

    @Test
    void toString_FloatRating_ShouldReturnStringValue() {
        Rating<Float> rating = new Rating<>(8.2f);

        String result = rating.toString();

        assertTrue(result.contains("8.2"));
    }
}