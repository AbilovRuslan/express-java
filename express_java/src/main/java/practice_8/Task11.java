package practice_8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task11 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 65, 23, 1, 6, 89);

        int maxNumber = numbers.stream()
                .max(Comparator.naturalOrder())
                .orElse(-1);

        System.out.println(numbers);
        System.out.println(maxNumber);
    }
}
