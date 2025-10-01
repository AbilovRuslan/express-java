package practice_10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MyStringUtilsList {
    //метод подсчета букв в строке
    public int countVowels(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return (int) input.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
    }

    //Параметризованный тест для различных строк
    @ParameterizedTest
    @CsvSource({
            "hello, 2",
            "java, 2",
            "AEIOU, 5",
            "'', 0",
            "bcdfg, 0"
    })
    void testCountVowels(String input, int expected) {
        assertEquals(expected, countVowels(input),
                () -> "Строка\"" + input + "\"должна содержать" + expected + "гласных");

    }

    //тест на null
    @Test
    void testNullInput() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> countVowels(null));
        assertEquals("Input cannot be null", exception.getMessage());

    }
}
