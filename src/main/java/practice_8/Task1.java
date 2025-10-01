package practice_8;


@FunctionalInterface
interface MathOperation {
    double operate(double a, double b);

}

public class Task1 {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        MathOperation sub = (a, b) -> a - b;
        MathOperation mult = (a, b) -> a * b;
        MathOperation div = (a, b) -> a / b;


        double x = 4, y = 9;
        System.out.println(add.operate(x, y));
        System.out.println(sub.operate(x, y));
        System.out.println(mult.operate(x, y));
        System.out.println(div.operate(x, y));
    }
}
