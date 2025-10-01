package practice_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class YearUtilsTest {
    //метод расчета года
    boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    //обычные года
    @Test
    void testCommonYears() {
        assertFalse(isLeapYear(2019));
        assertFalse(isLeapYear(2021));
        assertFalse(isLeapYear(2022));
    }

    //високосные года
    @Test
    void testLeapYears() {
        assertTrue(isLeapYear(2020));
        assertTrue(isLeapYear(2000));
        assertTrue(isLeapYear(1600));
    }

    //Года, делящиеся на 100, но не на 400: 1900, 2100 → false
    @Test
    void testCenturyNotLeap() {
        assertFalse(isLeapYear(1900));
        assertFalse(isLeapYear(2100));
    }

    //Граничные случаи: 0, 4, 400 → true
    @Test
    void testBoundaryYears() {
        assertTrue(isLeapYear(0));
        assertTrue(isLeapYear(4));
        assertTrue(isLeapYear(400));
    }
}
