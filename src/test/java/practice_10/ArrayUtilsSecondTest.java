package practice_10;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArrayUtilsSecondTest {
    int findSecondMax(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Array must not be null");
        }

        int[] distinctSorted = Arrays.stream(numbers)
                .distinct()
                .sorted()
                .toArray();

        if (distinctSorted.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two distinct elements");
        }

        return distinctSorted[distinctSorted.length - 2];
    }



        //Обычные массивы
    @Test
    void testNormalArray() {
        assertEquals(5, findSecondMax(new int[]{3, 5, 7, 2}));
    }

    //Массив с одинаковыми числами: [4, 4, 4, 4] → Должно выбрасываться NoSuchElementException.
    @Test
    void testAllSameArray() {
        assertThrows(IllegalArgumentException.class, () -> findSecondMax(new int[]{4, 4, 4, 4}));
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
