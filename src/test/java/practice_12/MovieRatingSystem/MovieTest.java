package practice_12.MovieRatingSystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    @Test
    void constructor_ShouldSetAllFields() {
        Movie movie = new Movie("Titanic", "Drama", 1997);

        assertEquals("Titanic", movie.getTitle());
        assertEquals("Drama", movie.getGenre());
        assertEquals(1997, movie.getReleaseYear());
    }

    @Test
    void equals_SameTitleAndYear_ShouldReturnTrue() {
        Movie movie1 = new Movie("The Saw", "Horror", 2004);
        Movie movie2 = new Movie("The Saw", "Horror", 2004);

        assertTrue(movie1.equals(movie2));
    }

    @Test
    void equals_DifferentTitle_ShouldReturnFalse() {
        Movie movie1 = new Movie("The Saw", "Horror", 2004);
        Movie movie2 = new Movie("Titanic", "Horror", 2004);

        assertFalse(movie1.equals(movie2));
    }

    @Test
    void equals_DifferentYear_ShouldReturnFalse() {
        Movie movie1 = new Movie("The Saw", "Horror", 2004);
        Movie movie2 = new Movie("The Saw", "Horror", 2005);

        assertFalse(movie1.equals(movie2));
    }

    @Test
    void equals_WithNull_ShouldReturnFalse() {
        Movie movie = new Movie("The Hours", "Drama", 2002);

        assertFalse(movie.equals(null));
    }

    @Test
    void equals_WithDifferentClass_ShouldReturnFalse() {
        Movie movie = new Movie("The Hours", "Drama", 2002);

        assertFalse(movie.equals("Not a Movie"));
    }

    @Test
    void hashCode_SameTitleAndYear_ShouldBeEqual() {
        Movie movie1 = new Movie("Titanic", "Drama", 1997);
        Movie movie2 = new Movie("Titanic", "Drama", 1997);

        assertEquals(movie1.hashCode(), movie2.hashCode());
    }

    @Test
    void hashCode_DifferentTitle_ShouldNotBeEqual() {
        Movie movie1 = new Movie("Titanic", "Drama", 1997);
        Movie movie2 = new Movie("The Saw", "Drama", 1997);

        assertNotEquals(movie1.hashCode(), movie2.hashCode());
    }

    @Test
    void hashCode_DifferentYear_ShouldNotBeEqual() {
        Movie movie1 = new Movie("Titanic", "Drama", 1997);
        Movie movie2 = new Movie("Titanic", "Drama", 1998);

        assertNotEquals(movie1.hashCode(), movie2.hashCode());
    }

    @Test
    void toString_ShouldReturnFormattedString() {
        Movie movie = new Movie("The Hours", "Drama", 2002);

        String result = movie.toString();

        assertTrue(result.contains("The Hours"));
        assertTrue(result.contains("2002"));
        assertTrue(result.contains("Drama"));
    }
}