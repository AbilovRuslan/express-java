package practice_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task7 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 25, 20, 40, 33);

        List<Integer> mult = numbers.stream()
                .filter(n -> n % 5 == 0)
                .collect(Collectors.toList());

        System.out.println(numbers);
        System.out.println(mult);
    }
}
