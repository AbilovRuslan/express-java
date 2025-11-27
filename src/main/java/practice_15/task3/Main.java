package practice_15.task3;

public class Main {
    public static void main(String[] args) {
        BookBuilder builder = new BookBuilder()
                .setTitle("War and Peace")
                .setAuthor("Leo Tolstoy")
                .setDescription("A historical novel about the Napoleonic Wars.")
                .setContent("Chapter 1: ...");

        BookProxy proxy = new BookProxy(builder);

        System.out.println("Before content access");

        System.out.println(proxy.getTitle());
        System.out.println(proxy.getAuthor());

        System.out.println("Loading content...");
        System.out.println(proxy.getContent());
    }

}