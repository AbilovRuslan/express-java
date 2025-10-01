package practice_3;

public class MathConstants {
    final double PI = 3.14159;
    final double E = 2.71828;

    public static double calculateCircleArea(double r) {
        return Math.PI * r * r;
    }

    public static double calculateCircumference(double r) {
        return 2 * Math.PI * r;

    }

    public static void main(String[] args) {
        System.out.println("Радиус 5 ");
        System.out.println("Площадь: " + calculateCircleArea(5.0));
        System.out.println("Длина:" + calculateCircumference(6));

        System.out.println("Радиус 8");
        System.out.println("Площадь: " + calculateCircleArea(8.0));
        System.out.println("Длина:" + calculateCircumference(3));


        System.out.println("Радиус 4 ");
        System.out.println("Площадь: " + calculateCircleArea(4.0));
        System.out.println("Длина:" + calculateCircumference(9));

    }


}

//
//Создайте класс MathConstants с полями:
//final double PI = 3.14159
//final double E = 2.71828
//Реализуйте статические методы calculateCircleArea(double r) — площадь круга
//и calculateCircumference(double r) — длина окружности.
//В main: вызовите методы с разными значениями радиуса.