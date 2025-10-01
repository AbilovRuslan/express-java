package practice_2;

public class Point {
    //поля
    double x;
    double y;

    //конструктор

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //геттеры
    double getX() {
        return x;
    }


    //сеттеры
    void setX(double x) {
        this.x = x;
    }

    void print() {
        System.out.println("Координаты: " + x + ", " + y);
    }

}

//Создайте класс Point с координатами x и y.
//        Реализуйте конструктор, геттеры, сеттер только для x, и метод print(),
//выводящий координаты. В main измените x, выведите новые координаты.
