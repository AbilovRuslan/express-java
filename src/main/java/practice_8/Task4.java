package practice_8;

import java.util.function.Function;

public class Task4 {
    public static void main(String[] args) {
        Function<String, Integer> getLength = s -> s.length();

        String text = "Hello sucker!";
        int length = getLength.apply(text);

        System.out.println(text);
        System.out.println(length);
    }
}
