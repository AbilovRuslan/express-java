package practice_12.StudentGrad;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeServiceTest {
    private GradeService<Integer> service;

    @BeforeEach
    void setUp() {
        service = new GradeService<>();
    }

    @Test
    void testAddValidGrade() throws InvalidGradeException {
        StudentGrade<Integer> grade = new StudentGrade<>("Иван", "Алгебра", 90);
        service.addGrade(grade);
        assertEquals(1, service.getAllGrades().size());
        assertEquals(90, service.getAllGrades().get(0).getGrade());
    }

    @Test
    void testAddInvalidGrade() {
        StudentGrade<Integer> grade = new StudentGrade<>("Анна", "Физика", -67);  // ИСПРАВЛЕНО: добавить минус
        InvalidGradeException exception = assertThrows(InvalidGradeException.class, () -> service.addGrade(grade));
        assertTrue(exception.getMessage().contains("не может быть отрицательной"));
    }

    @Test
    void testCalculateAverage() throws InvalidGradeException {
        service.addGrade(new StudentGrade<>("Алла Пугачева", "Пение", 100));
        service.addGrade(new StudentGrade<>("Пуга Алычева", "Пение", 1));
        service.addGrade(new StudentGrade<>("Мымра Какаято", "Танцы", 70));

        assertEquals(50.5, service.calculateAverage("Пение"));
        assertEquals(70.0, service.calculateAverage("Танцы"));
        assertEquals(0.0, service.calculateAverage("Лепка"));
    }
}

