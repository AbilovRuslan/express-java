package practice_1;


public class MathOperations {
    public static void main(String[] args) {
        int add1 = add(100, 200);
        int subtract1 = subtract(400, 200);
        int multiply1 = multiply(4, 5);
        double divide1 = divide(3, 2);
        int max = findMax(3, 12);
        int max1 = difference(10, 21);
        int area = squareArea(3);
        int param = squarePerimeter(6);
        double conver = convertSecondsToMinutes(241);
        double hypo = findHypotenuse(45, 24);
        double radius = circleCircumference(22);
        double percen = calculatePercentage(200, 25);
        double cels = celsiusToFahrenheit(98);
        double fahr = fahrenheitToCelsius(120);
        System.out.println(add1);
        System.out.println(subtract1);
        System.out.println(multiply1);
        System.out.println(divide1);
        System.out.println(max);
        System.out.println(max1);
        System.out.println(area);
        System.out.println(param);
        System.out.println(conver);
        System.out.println(hypo);
        System.out.println(radius);
        System.out.println(percen);
        System.out.println(cels);
        System.out.println(fahr);

    }

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

    public static int findMax(int a, int b) {
        return Math.max(a, b);
    }

    public static int difference(int x, int y) {
        return Math.abs(x - y);
    }

    public static int squareArea(int side) {
        return side * side;
    }

    public static int squarePerimeter(int side) {
        return 4 * side;
    }

    public static double convertSecondsToMinutes(int seconds) {
        return seconds / (double) 60;
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