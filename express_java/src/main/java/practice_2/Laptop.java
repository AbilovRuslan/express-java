package practice_2;

public class Laptop {
    //поля
    String brand;
    double price;

    //конструктор
    Laptop(String brand, double price){
        this.brand = brand;
        this.price = price;

    }
    //геттер
    String getBrand(){
        return brand;
    }

    double getPrice(){
        return price;
    }

    //сеттер
    void setBrand(String brand){
        this.brand = brand;
    }

    void setPrice(double price){
        this.price = price;
    }

    //на печать
    void print(){
        System.out.println("Марка компа: " +brand+ ", Цена: " +price);
    }

}
//Создайте класс Laptop с полями brand и price.
//        Реализуйте конструктор, геттеры и сеттеры, и метод printInfo(),
//выводящий информацию о ноутбуке и его цене. В main измените цену и выведите информацию.