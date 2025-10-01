package practice_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task18 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 23, 34, 45, 67, 89);

        double average = numbers.stream()
                .collect(Collectors.averagingInt(n -> n));

        System.out.println(numbers);
        System.out.println(average);

    }
}
