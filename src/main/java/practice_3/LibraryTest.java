package practice_3;

public class LibraryTest {
    public static void main(String[] args) {
        Library book = new Library("муму",
                "Тургенев",
                1880,
                "Drama");

        System.out.println("Первые значения: ");
        System.out.println("Название:  " + book.getBookTitle());
        System.out.println("Автор: " + book.getAuthor());
        System.out.println("Автор: " + book.getYear());
        System.out.println("Автор: " + book.getCategory());

        book.setBookTitle("Мертвые души");
        book.setAuthor("Гоголь");
        book.setYear(1870);
        book.setCategory("Detective");


        System.out.println("Вторые значения: ");
        System.out.println("Название:  " + book.getBookTitle());
        System.out.println("Автор: " + book.getAuthor());
        System.out.println("Год: " + book.getYear());
        System.out.println("Жанр: " + book.getCategory());


        //System.out.println(book.booktitle);
        System.out.println(book.year);
        System.out.println(book.category);
        System.out.println(book.author);
        //System.out.println(book.book);


    }

}
