package practice_15.task3;

public class Main {
    public static void main(String[] args) {
        // Инициализация BookBuilder для создания книги
        BookBuilder builder = new BookBuilder();
        Book book = builder.setTitle("War and Peace")
                .setAuthor("Leo Tolstoy")
                .setDescription("A historical novel about the Napoleonic Wars.")
                .setContent("Chapter 1: 'Well, Prince, so Genoa and Lucca...'")
                .build();

        BookProxy proxy = new BookProxy(book);

        System.out.println("Book title: " + proxy.getTitle());
        System.out.println("Book author: " + proxy.getAuthor());

        String content = proxy.getContent();
        System.out.println("Content of the book: " + content);

        String contentAgain = proxy.getContent();
        System.out.println("Content again: " + contentAgain);
    }
}
