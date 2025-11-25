package practice_15.task3;

public class BookProxy {
    private Book realBook;
    private BookBuilder builder;
    private boolean isLoaded = false;

    public BookProxy(Book realBook) {
        this.realBook = realBook;
        this.builder = builder;
    }

    public String getContent() {
        if (!isLoaded) {
            System.out.println("First access - loading book content lazily...");
            if (realBook == null && builder != null) {
                realBook = builder.build();
            }
            isLoaded = true;
        }
        return realBook.getContent();
    }

    public String getTitle() {
        return realBook.getTitle();
    }

    public String getAuthor() {
        return realBook.getAuthor();
    }

    public String getDescription() {
        return realBook.getDescription();
    }
}
