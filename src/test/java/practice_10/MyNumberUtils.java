package practice_10;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MyNumberUtilsTest {

    //метод проверяет, является ли четным
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    //Параметризованный тест для проверки четности
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 50, -6,})
    void testEvenNumbers(int number) {
        assertTrue(isEven(number), number + "должно быть четным");
    }

    //Параметризованный тест на нечетность
    @ParameterizedTest
    @ValueSource(ints = {1, 7, 33, -5, -9,})
    void testOddNumber(int number) {
        assertFalse(isEven(number), number + "должно быть нечетным");
    }

    //проверим 0
    @Test
    void testZero() {
        assertTrue(isEven(0), "0 это четное");
    }
}
