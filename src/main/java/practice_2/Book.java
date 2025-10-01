package practice_2;

public class Book {
    //поля
    String title;
    String author;

    //конструктор
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    //геттеры
    String getTitle() {
        return title;
    }

    String getAuthor() {
        return author;
    }

    //сетттеры
    void setTitle(String title) {
        this.title = title;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    //метод на печать
    void print() {
        System.out.println(title + ", " + author);
    }

}

//Создайте класс Book с полями title и author.
//        Реализуйте конструктор, геттеры и сеттеры, и метод printInfo(),
//выводящий название и автора книги.
//В main создайте книгу, измените автора и выведите информацию.
