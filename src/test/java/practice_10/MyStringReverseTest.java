package practice_10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MyStringReverseTest {

    //метод для разворота
    public String reverse(String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }

    //Параметризованный тест для разворота
    @ParameterizedTest
    @CsvSource({
            "hello, olleh",
            "Java, avaJ",
            " '','' ",
            "a , a",
            "12345,54321"
    })
    void testReverseString(String input, String expected) {
        assertEquals(expected, reverse(input),
                () -> "Строка\"" + input + "\"должна быть развернута в \"" + expected + "\"");
    }

    //отдельный на null
    @Test
    void testNullInput() {
        assertNull(reverse(null), "если null, возвращаем null");
    }

}
