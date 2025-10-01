package practice_3;

public class Company {

    //поля
    static String companyName = "NA";
    final int employeeID;
    String employeeName;

    //конструктор
    public Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    //геттер
    public int getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }
    //сеттер

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;

    }

    //вывод
    public static void printCompanyName() {
        System.out.println("название компании: " + companyName);


    }

}


//Создайте класс Company с полями:
//static String companyName — общее название для всех сотрудников
//final int employeeID — уникальный идентификатор (нельзя менять)
//String employeeName — имя сотрудника Реализуйте конструктор, принимающий employeeID
// и employeeName, статический метод printCompanyName(),
// геттеры и сеттеры для employeeName.
// В main: создайте несколько сотрудников, измените companyName и проверьте,
// что она изменилась для всех. Попробуйте изменить employeeID — должно быть невозможно.
