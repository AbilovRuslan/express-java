package practice_2;

public class Rectangle {

    //поля
    static double width;
    static double height;

    //конструктор

    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    //геттеры
    double getWidth(){
        return width;
    }

    double getHeight() {
        return height;
    }
    //сеттеры

    void setWidth(double width){
        this.width = width;
    }

    void setHeight (double height){
        this.height = height;
    }

    //метод расчета площади прямоугольника

    public double calculateArea(){
        return  width * height;
    }

    //метод печати
    void print(){
       System.out.println("Площадь равна:" +calculateArea());
    }

}

//
//Создайте класс Rectangle с полями width и height.
//        Реализуйте конструктор, геттеры для ширины и высоты,
//        сеттер только для ширины и метод calculateArea()
//для расчёта площади.
//В main создайте прямоугольник, измените ширину и выведите площадь.
//
//Класс Rectangle: Реализуйте calculateArea() как width * height. Сеттер нужен только для width.