package practice_8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task12 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 56, 23, 11, 7, 89);

        int minNumber = numbers.stream()
                .min(Comparator.naturalOrder())
                .orElse(-1);

        System.out.println(numbers);
        System.out.println(minNumber);

    }
}
