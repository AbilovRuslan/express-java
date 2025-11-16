package practice_14.task7;

public class Shop {
    public Order createOrder() {
        return new OrderBuilder()
                .addItem("Laptop")
                .addItem("Mouse")
                .applyDiscount(0.15)
                .payWith("Credit Card")
                .build();
    }
}
