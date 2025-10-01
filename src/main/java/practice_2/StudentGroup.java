package practice_2;

public class StudentGroup {
    //поля
    String groupName;
    int studentCount;

    //конструктор

    StudentGroup(String groupName, int studentCount) {
        this.groupName = groupName;
        this.studentCount = studentCount;
    }

    //геттеры
    String getGroupName() {
        return groupName;
    }

    int getStudentCount() {
        return studentCount;
    }

    //сеттеры
    void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    //метод вывода на печать

    void print() {
        System.out.println("название группы: " + groupName + ", " + "Количество человек в группе: " + studentCount);
    }


}


//Создайте класс StudentGroup с полями groupName и studentCount.
//        Реализуйте конструктор, геттеры и сеттеры, и метод printInfo(),
//выводящий информацию о группе и количестве студентов.
//В main измените число студентов и выведите информацию.
