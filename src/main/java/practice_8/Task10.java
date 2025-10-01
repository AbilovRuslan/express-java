package practice_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task10 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("дом", "диван", "кровать", "машина", "дом", "диван");
        List<String> unique = words.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(words);
        System.out.println(unique);
    }
}
