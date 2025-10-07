package practice_12.StudentGrad;

import java.util.ArrayList;
import java.util.List;

public class GradeService<T extends Number> {
    private final List<StudentGrade<T>> grades = new ArrayList<>();

    public synchronized void addGrade(StudentGrade<T> grade) throws InvalidGradeException {
        if (grade.getGrade().doubleValue() < 0 ){
            throw new InvalidGradeException("Оценка не может быть отрицательной: " + grade.getGrade());
        }
        grades.add(grade);
    }

    public synchronized double calculateAverage(String subject) {
        double sum = 0;
        int count = 0;
        for (StudentGrade<T> grade : grades) {
            if (grade.getSubject().equalsIgnoreCase(subject)) {
                sum += grade.getGrade().doubleValue();
                count++;
            }
        }
        return count > 0 ? sum / count : 0.0;
    }

    public synchronized List<StudentGrade<T>> getAllGrades() {
        return new ArrayList<>(grades);

    }
}






