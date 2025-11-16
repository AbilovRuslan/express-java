package practice_14.task7;

import java.util.List;

public class Order {
    private final List<String> items;
    private final double discount;
    private final String paymentMethod;

    Order(List<String> items, double discount, String paymentMethod) {
        this.items = items;
        this.discount = discount;
        this.paymentMethod = paymentMethod;
    }

    public List<String> getItems() {
        return items;
    }

    public double getDiscount() {
        return discount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    @Override
    public String toString() {
        return "Order{" +
                "items=" + items +
                ", discount=" + discount +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
}
