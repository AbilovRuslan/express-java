package practice_8;

import java.util.function.Predicate;

public class Task3 {
    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x % 2 == 0;

        int a = 8;
        int b = 5;

        System.out.println(isEven.test(a));
        System.out.println(isEven.test(b));
    }
}
