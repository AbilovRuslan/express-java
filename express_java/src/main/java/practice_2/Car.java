package practice_2;

public class Car {
  //поля
    String brand;
    int year;

    //конструктор
    Car (String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    //геттер
    String getBrand(){
        return brand;
    }

    int getYear(){
        return year;
    }


    //сеттер
    void setBrand(String brand){
        this.brand = brand;
    }

    void setYear(int year){
        this.year = year;
    }

    void print(){
        System.out.println("Марка:" +brand+", Год: "+ year);
    }

}


//Создайте класс Car с полями brand (строка) и year (целое число).
//Реализуйте конструктор с двумя параметрами, геттеры и сеттеры для обоих полей, метод print(),
//выводящий информацию о марке и годе выпуска. В main создайте объект,
//установите значения через конструктор, измените год через сеттер, выведите информацию.