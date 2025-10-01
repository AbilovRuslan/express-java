package practice_5.Dish;

public class Menu {
    public Dish dish;

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public void showDescription() {
        System.out.println(dish.getTemperature());

    }
}
