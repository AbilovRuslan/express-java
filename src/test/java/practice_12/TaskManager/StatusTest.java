package practice_12.TaskManager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatusTest {

    @Test
    void testStatusValues() {
        Status[] statuses = Status.values();

        assertEquals(3, statuses.length);
        assertEquals(Status.NEW, statuses[0]);
        assertEquals(Status.IN_PROGRESS, statuses[1]);
        assertEquals(Status.DONE, statuses[2]);
    }

    @Test
    void testStatusValueOf() {
        assertEquals(Status.NEW, Status.valueOf("NEW"));
        assertEquals(Status.IN_PROGRESS, Status.valueOf("IN_PROGRESS"));
        assertEquals(Status.DONE, Status.valueOf("DONE"));
    }
}