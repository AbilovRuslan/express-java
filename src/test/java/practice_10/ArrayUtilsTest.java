package practice_10;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArrayUtilsTest {

    int findMax(int[] numbers) {
        return Arrays.stream(numbers).max().orElseThrow();
    }

    @Test
    void testNormalArray() {
        assertEquals(7, findMax(new int[]{3, 5, 7, 2}));
    }

    @Test
    void testSingleElement() {
        assertEquals(1, findMax(new int[]{1}));
    }

    @Test
    void testNegativeElement() {
        assertEquals(-2, findMax(new int[]{-3, -5, -7, -2}));
    }

    @Test
    void testEmptyArray() {
        assertThrows(NoSuchElementException.class, () -> findMax(new int[]{}));
    }

    @Test
    void testNullArray() {
        assertThrows(NullPointerException.class, () -> findMax(null));
    }
}
