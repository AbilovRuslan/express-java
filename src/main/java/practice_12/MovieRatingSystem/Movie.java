package practice_12.MovieRatingSystem;

import java.util.Objects;

public class Movie {
    private final String title;
    private final String genre;
    private final int releaseYear;

    public Movie(String title, String genre, int releaseYear) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return releaseYear == movie.releaseYear && Objects.equals(title, movie.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, releaseYear);
    }

    @Override
    public String toString() {
        return "Movie{" + "title='" + title + '\'' + ", genre='" + genre + '\'' + ", releaseYear=" + releaseYear + '}';
    }
}