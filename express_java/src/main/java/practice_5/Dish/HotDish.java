package practice_5.Dish;

public class HotDish implements Dish {
    public int temperature;

    public HotDish(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public int getDescription() {
        return temperature;
    }
}
