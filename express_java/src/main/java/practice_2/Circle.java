package practice_2;

public class Circle {
    //поля
    int radius;
    //конструктор
    Circle (int radius){
        this.radius = radius;
    }

    //геттер
    int getRadius (){
    return radius;
    }
    //сеттер
    void setRadius(int radius){
        this.radius = radius;
    }

    //метод для площади
    double calculateArea(){
        return 2 * Math.PI * radius;
    }

    //метод для длины окр
    double calculateCircumference(){
        return Math.PI*radius*radius;
    }

    //метод для печати
    void print (){
        System.out.println("Площадь круга: " + calculateArea()+", Длина окружности: "+calculateCircumference());
    }


}

//Создайте класс Circle с полем radius.
//        Реализуйте конструктор, геттер и сеттер, методы calculateArea() и calculateCircumference().
//В main измените радиус, выведите площадь и длину окружности.
//Используйте Math.PI для вычислений в методах
//calculateArea() и calculateCircumference().