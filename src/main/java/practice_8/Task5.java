package practice_8;

import java.util.function.Consumer;

public class Task5 {
    public static void main(String[] args) {
        Consumer<String> print = s -> System.out.println(s);

        print.accept("I'm famous!");
        print.accept("Sorry))");
    }
}
