package practice_8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task16 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("арба", "баран", "ветвь", "акация", "акция", "боль", "вой");

        //map потому что первая буква ключ
        //Character обертка для char. Используем как объект
        Map<Character, List<String>> grouped = words.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));

        System.out.println(words);
        System.out.println(grouped);
    }
}
