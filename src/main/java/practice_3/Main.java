package practice_3;

public class Main {
    public static void main(String[] args) {
        Company emp1 = new Company(1, "Маша Сашина");
        Company emp2 = new Company(2, "Саша Машин");

        Company.printCompanyName();
        Company.companyName = "Рога и копыта";
        Company.printCompanyName();


        University stud1 = new University("First", 12, "Lola Nabokoff");
        University stud2 = new University("Second", 11, "Juan Ivan");
        University stud3 = new University("Third", 10, "MIke Jagger");


        stud1.printStudentInfo();
        stud2.printStudentInfo();
        stud3.printStudentInfo();

        University.changeUniversityName("МАИ");

        stud1.printStudentInfo();
        stud2.printStudentInfo();
        stud3.printStudentInfo();

        GameSettings game1 = new GameSettings(12, "footbool", 19);
        GameSettings game2 = new GameSettings(13, "Hookey", 24);


        GameSettings.setMaxPlayers(10);
        game1.addPlayer();
        game2.addPlayer();

        game2.printGameStatus();
        game1.printGameStatus();

        Person person1 = new Person("John", "Smith", "123-45-6789");
        Person person2 = new Person("Donald", "Tramp", "123-45-4567");

        person1.printPersonInfo();
        person2.printPersonInfo();

        person1.setLastName("Bob");

        person1.printPersonInfo();
        person2.printPersonInfo();


    }

}
