package practice_3;

public class Person {
    private String firstName;
    private String lastName;
    private final String ssn;

    public Person(String firstName, String lastName, String ssn){
        this.firstName =firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public String getSsn(){
        return ssn;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void printPersonInfo(){
        System.out.println("Name: "+firstName + "Second name: "+lastName+"SSN"+ssn );
    }

}


//private String firstName
//private String lastName
//private final String ssn — номер социального страхования
//Реализуйте конструктор для всех трёх полей,
//геттеры для всех полей, сеттеры только для firstName и lastName,
//метод printPersonInfo() — выводит: "Имя: Иван, Фамилия: Иванов, SSN: 123-45-6789".
//В main: создайте несколько объектов, измените имя у одного и выведите информацию.
