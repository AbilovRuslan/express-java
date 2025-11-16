package practice_14.task7;

import java.util.ArrayList;
import java.util.List;

public class OrderBuilder {
    private final List<String> items = new ArrayList<>();
    private double discount;
    private String paymentMethod;

    public OrderBuilder addItem(String item) {
        items.add(item);
        return this;
    }

    public OrderBuilder applyDiscount(double discount) {
        this.discount = discount;
        return this;
    }

    public OrderBuilder payWith(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    public Order build() {
        return new Order(new ArrayList<>(items), discount, paymentMethod);
    }

}
