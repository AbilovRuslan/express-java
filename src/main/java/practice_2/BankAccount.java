package practice_2;

public class BankAccount {
    //поля
    String owner;
    double balance;

    //конструктор
    BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    //геттеры
    String getOwner() {
        return owner;
    }

    //сеттеры
    void setOwner(String owner) {
        this.owner = owner;
    }

    //метод deposit(amount)
    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }
    //метод вывода на печать

    void print() {
        System.out.println("Владелец счета: " + owner + ", " + "Баланс счета:" + balance);
    }


}
//
//Создайте класс BankAccount с полями owner и balance.
//        Реализуйте конструктор, геттеры, сеттер для владельца,
//методы deposit(amount) и withdraw(amount) и метод printBalance().
//В main внесите деньги, снимите и выведите баланс.