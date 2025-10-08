package practice_12.MovieRatingSystem;

public class Main {
    public static void main(String[] args) {
        MovieService movieService = new MovieService();

        Movie saw = new Movie("The Saw", "Horror", 2010);
        Movie hours = new Movie("The Hours", "Drama", 2000);
        Movie titanic = new Movie("The Titanic", "Drama", 1998);

        movieService.addRating(saw, new Rating<>(9));
        movieService.addRating(saw, new Rating<>(8));
        movieService.addRating(saw, new Rating<>(7));

        movieService.addRating(hours, new Rating<>(8.5));
        movieService.addRating(hours, new Rating<>(8));
        movieService.addRating(hours, new Rating<>(6));

        movieService.addRating(titanic, new Rating<>(10));
        movieService.addRating(titanic, new Rating<>(9.5));
        movieService.addRating(titanic, new Rating<>(9));

        System.out.println("\nСортировка по средней оценке:");
        movieService.getMovieSortedByPopularity()
                .forEach(m -> System.out.printf("%s - %.2f%n",
                        m.getTitle(), movieService.getAverageRating(m)));

        System.out.println("\n Сортировка по популярности:");
        movieService.getMovieSortedByPopularity()
                .forEach(m -> System.out.printf("%s — %d оценок%n",
                        m.getTitle(), movieService.getRatingCount(m)));


    }
}
