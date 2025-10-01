package practice_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringUtilsTest {
    public int countWords(String sentence) {
        if (sentence == null) throw new IllegalArgumentException();
        return sentence.trim().isEmpty() ? 0 : sentence.trim().split("\\s+").length;
    }

    // //Обычная строка: "Hello world" → countWords() → 2.
    @Test
    void testNormalSentence() {
        assertEquals(2, countWords("Hello world"));
    }

    //Строка с лишними пробелами: " Java is awesome " → countWords() → 3.
    @Test
    void testSentenceWithExtraSpaces() {
        assertEquals(3, countWords(" Java is awesome "));
    }


    //Пустая строка: "" → countWords() → 0.
    @Test
    void testEmptyString() {
        assertEquals(0, countWords(""));
    }

    //Строка с пробелами: " " → countWords() → 0.
    @Test
    void testSpacesOnly() {
        assertEquals(0, countWords("     "));

    }


    //null → Должно выбрасываться IllegalArgumentException.
    @Test
    void testNullString() {
        assertThrows(IllegalArgumentException.class, () -> countWords(null));
    }
}
