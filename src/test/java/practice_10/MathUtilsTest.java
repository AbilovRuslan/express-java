package practice_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MathUtilsTest {
    int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative numbers not allowed");
        return (n == 0) ? 1 : n * factorial(n - 1);
    }

    //0! = 1
    @Test
    void testFactorialZero() {
        assertEquals(1, factorial(0));
    }

    //Маленькие числа (1!, 5!, 7!)
    @Test
    void testFactorialSmallNumbers() {
        assertEquals(1, factorial(1));
        assertEquals(120, factorial(5));
        assertEquals(5040, factorial(7));
    }

    //Отрицательные числа (должно выбрасываться исключение)
    @Test
    void testFactorialNagative() {
        assertThrows(IllegalArgumentException.class, () -> factorial(-3));
    }
}
