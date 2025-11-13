package practice_13.task5ocp;

public class Bitcoin implements PaymentProcessor{
    @Override
    public void processPayment(double amount) {
        System.out.println("Оплата Bitcoin на сумму " + amount);
    }
}
