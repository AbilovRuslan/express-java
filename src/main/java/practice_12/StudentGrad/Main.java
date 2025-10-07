package practice_12.StudentGrad;

public class Main {
    public static void main(String[] args) {
        GradeService<Integer> gradeService = new GradeService<>();
        try {
            gradeService.addGrade(new StudentGrade<>("Дима Птеров", "Алгебра", 89));
            gradeService.addGrade(new StudentGrade<>("Лиза Шарикова", "Алгебра", 90));
            gradeService.addGrade(new StudentGrade<>("Коля Иванов", "Физика", 79));

            System.out.println("Средняя по алгебре: "+gradeService.calculateAverage("Алгебра"));
            System.out.println("Средняя по физике: "+gradeService.calculateAverage("Физика"));

            gradeService.addGrade(new StudentGrade<>("Анна","Химия",-7));
        }catch (InvalidGradeException e){
            System.out.println("Ошибка: "+e.getMessage());
        }
    }
}
