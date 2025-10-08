package practice_12.TaskManager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PriorityTest {

    @Test
    void testPriorityValues() {
        Priority[] priorities = Priority.values();

        assertEquals(3, priorities.length);
        assertEquals(Priority.LOW, priorities[0]);
        assertEquals(Priority.MEDIUM, priorities[1]);
        assertEquals(Priority.HIGH, priorities[2]);
    }

    @Test
    void testPriorityValueOf() {
        assertEquals(Priority.LOW, Priority.valueOf("LOW"));
        assertEquals(Priority.MEDIUM, Priority.valueOf("MEDIUM"));
        assertEquals(Priority.HIGH, Priority.valueOf("HIGH"));
    }
}