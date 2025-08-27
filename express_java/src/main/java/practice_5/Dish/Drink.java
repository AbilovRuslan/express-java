package practice_5.Dish;

public class Drink implements Dish {
    public int volume;

    public Drink(int volume) {
        this.volume = volume;
    }

    @Override
    public int getTemperature() {
        return volume;
    }
}
