package practice_2;

public class Product {
    //поля
    String name;
    double price;

    //конструктор
    Product (String name, double price){
        this.name = name;
        this.price = price;
    }
    //геттер
    String getName (){
        return name;
    }

    double getPrice(){
        return price;
    }

    //сеттер
   void setPrice(double price){
        this.price = price;
   }

    //метод для скидки
    double applyDiscount(double discount){
        return price - price * discount / 100;

    }

    //метод для печати

    void print(){
        System.out.println("Товар: "+ name+ " Стоимость без скидки: " + price+ ", Стоимость с учетом скидки: " + applyDiscount(10));
    }





}


//Создайте класс Product с полями name и price.
//        Реализуйте конструктор, геттеры, сеттер для цены, метод applyDiscount(discount) для применения скидки, и метод printInfo(),
//выводящий информацию о товаре и цене.
//В main измените цену, примените скидку и выведите цену.