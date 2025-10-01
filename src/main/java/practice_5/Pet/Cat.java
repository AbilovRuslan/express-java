package practice_5.Pet;

public class Cat implements Pet {
    @Override
    public void feed() {
        System.out.println("Кошка сожрала полдома!");
    }


    @Override
    public void interact() {
        System.out.println("Кошка все шторы оборвала! Тварь!");
    }
}
