package practice_7;

public class Task2 {
    public static void main(String[] args) {
        divide(10, 0);
        divide(20, 5);
    }

    public static void divide(int a, int b) {
        try {
            int result = a / b;

            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("делить на 0 нельзя");
        }
    }
}
