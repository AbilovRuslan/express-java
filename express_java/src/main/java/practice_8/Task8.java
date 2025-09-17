package practice_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task8 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("дом", "диван", "кровать", "машина");

        List<Integer>length = words.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());

        System.out.println(words);
        System.out.println(length);
    }
}
