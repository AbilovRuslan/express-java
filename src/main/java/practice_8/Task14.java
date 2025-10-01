package practice_8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task14 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Блин", "ком", "дом", "сон");

        Optional<String> lettersB = words.stream()
                .filter(s -> s.startsWith("Б"))
                .findFirst();

        System.out.println(words);
        System.out.println(lettersB);

    }
}
