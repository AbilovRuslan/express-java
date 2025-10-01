package practice_8;

import java.util.Arrays;
import java.util.List;

public class Task13 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(34, 1, 45, 78, 121);
        int sum = numbers.stream()
                .mapToInt(n -> n)
                .sum();
        System.out.println(numbers);
        System.out.println(sum);


    }
}
