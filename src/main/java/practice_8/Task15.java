package practice_8;

import java.util.Arrays;
import java.util.List;

public class Task15 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 6, 8, 5, 7);

        boolean asEven = numbers.stream()
                .anyMatch(n -> n % 2 == 0);

        System.out.println(numbers);
        System.out.println(asEven);
    }
}
