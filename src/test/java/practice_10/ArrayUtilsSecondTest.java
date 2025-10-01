package practice_10;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArrayUtilsSecondTest {
    int findSecondMax(int[] numbers) {
        return Arrays.stream(numbers).distinct().sorted().skip(numbers.length - 2).findFirst().orElseThrow();
    }

    //Обычные массивы
    @Test
    void testNormalArray() {
        assertEquals(5, findSecondMax(new int[]{3, 5, 7, 2}));
    }

    //Массив с одинаковыми числами: [4, 4, 4, 4] → Должно выбрасываться NoSuchElementException.
    @Test
    void testAllSameArray() {
        assertThrows(NoSuchElementException.class, () -> findSecondMax(new int[]{4, 4, 4, 4}));
    }

    //Один элемент: [8] → Должно выбрасываться NoSuchElementException.

    @Test
    void testSingleElement() {
        assertThrows(IllegalArgumentException.class, () -> findSecondMax(new int[]{8}));
    }

    // Пустой массив -> IllegalArgumentException
    @Test
    void testEmptyArray() {
        assertThrows(IllegalArgumentException.class, () -> findSecondMax(new int[]{}));
    }
}
