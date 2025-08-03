package practice_2;

public class Product {
    //поля
    String name;
    double price;

    //конструктор
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //геттеры
    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }

    //сеттер
    void setPrice(double price) {
        this.price = price;
    }

    //метод для скидки (ваша версия)
    double applyDiscount(double discount) {
        return price - price * discount / 100;
    }

    //метод для печати (версия с параметром discount)
    void print(double discount) {
        System.out.println("Товар: " + name +
                ", Стоимость без скидки: " + price +
                ", Стоимость с учетом скидки: " + applyDiscount(discount));
    }
}