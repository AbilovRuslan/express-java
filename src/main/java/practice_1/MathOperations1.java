package practice_1;

public class MathOperations1 {
    public static void main(String[] args) {
        //переменные
        int add1 = add(4, 6);
        int subtr = subtract(10, 9);
        int mult = multiply(5, 5);
        double divide1 = divide(3, 2);
        int max1 = findMax(1, 35);
        int max2 = difference(12, 45);
        int sqarea = squareArea(4);
        int perem = squarePerimeter(9);
        double secun = convertSecondsToMinutes(240);
        double speed = averageSpeed(120.0, 40.0);
        double hypo = findHypotenuse(45, 57);
        double circum1 = circleCircumference(23);
        double proc = calculatePercentage(80, 40);
        double cels = celsiusToFahrenheit(30);
        double fahr = fahrenheitToCelsius(98);
        System.out.println("Сумма = " + add1);
        System.out.println(subtr);
        System.out.println("Произведение =" + mult);
        System.out.println("Деление =" + divide1);
        System.out.println("Максимальное = " + max1);
        System.out.println("разница = " + max2);
        System.out.println(sqarea);
        System.out.println(perem);
        System.out.println(secun);
        System.out.println(speed);
        System.out.println(hypo);
        System.out.println(circum1);
        System.out.println(proc);
        System.out.println(cels);
        System.out.println(fahr);


    }

    //методы
    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(int x, int y) {
        return x / (double) y;

    }

    public static int findMax(int x, int y) {
        return (Math.max(x, y));
    }

    public static int difference(int x, int y) {
        return (Math.abs(x - y));
    }

    public static int squareArea(int side) {
        return side * side;
    }

    public static int squarePerimeter(int side) {
        return 4 * side;
    }

    public static double convertSecondsToMinutes(int seconds) {
        return seconds / 60.0;
    }

    public static double averageSpeed(double distance, double time) {
        return distance / time;
    }

    public static double findHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculatePercentage(double total, double part) {
        return (part / total) * 100;
    }

    public static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

}
