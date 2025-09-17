package practice_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Task9 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 12, 34);
        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println(numbers);
        System.out.println(squares);
    }
}
