package practice_8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task17 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 4, 5, 6, 7, 8, 9, 2, 3);

        Map<Boolean, List<Integer>> grouped = numbers.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0));

        System.out.println(numbers);
        System.out.println(grouped);
    }
}
