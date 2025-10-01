package practice_3;

public class Library {
    private String bookTitle;
    protected String author;
    int year;
    public String category;

    //конструктор
    public Library(String bookTitle, String author, int year, String category) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.year = year;
        this.category = category;
    }

    //геттеры
    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getCategory() {
        return category;
    }

    //сеттеры

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCategory(String category) {
        this.category = category;
    }


}

//
//Создайте класс Library с полями:
//private String bookTitle
//protected String author
//int year (default-доступ)
//public String category Реализуйте геттеры и сеттеры для всех полей.
//В другом классе (например, LibraryTest)
//создайте объект Library и проверьте доступ к полям.