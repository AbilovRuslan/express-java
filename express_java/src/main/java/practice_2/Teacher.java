package practice_2;

public class Teacher {
    //поля
    String name;
    String subject;

    //конструктор

    Teacher (String name, String subject){
        this.name = name;
        this.subject = subject;
    }

    //геттеры
    String getName(){
        return name;
    }

    String getSubject(){
        return subject;
    }

    //сеттеры

    void setName(String name){
        this.name = name;
    }

    void setSubject(String subject){
        this.subject = subject;
    }

    //метод для вывода печати
    void print(){
        System.out.println("Учитель: "+name+"  " + "Предмет: "+subject);
    }
}


//Создайте класс Teacher с полями name и subject.
//        Реализуйте конструктор, геттеры и сеттеры, и метод printInfo(),
//выводящий информацию о учителе и предмете.
//В main измените предмет и выведите обновлённую информацию.