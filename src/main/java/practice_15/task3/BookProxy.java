package practice_15.task3;

public class BookProxy {
    private Book realBook;
    private final BookBuilder builder;

    public BookProxy(BookBuilder builder) {
        if (builder == null) {
            throw new IllegalArgumentException("Builder must not be null");
        }
        this.builder = builder;
    }

    private Book getRealBook() {
        if (realBook == null) {
            System.out.println("Lazy loading book...");
            realBook = builder.build();
        }
        return realBook;
    }

    public String getContent() {
        return getRealBook().getContent();
    }

    public String getTitle() {
        return getRealBook().getTitle();
    }

    public String getAuthor() {
        return getRealBook().getAuthor();
    }

    public String getDescription() {
        return getRealBook().getDescription();
    }
}
