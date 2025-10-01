package practice_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task6 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("дом", "диван", "кровать", "машина");
        List<String> filtered = words.stream()
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());

        System.out.println(words);
        System.out.println(filtered);

    }
}
