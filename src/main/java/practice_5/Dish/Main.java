package practice_5.Dish;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        menu.setDish(new HotDish(34));
        menu.showDescription();

        menu.setDish(new Drink(100));
        menu.showDescription();
    }
}
