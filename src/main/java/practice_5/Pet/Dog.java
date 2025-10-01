package practice_5.Pet;

public class Dog implements Pet {
    @Override
    public void feed() {
        System.out.println("Собака сожрала кошку!");
    }

    @Override
    public void interact() {
        System.out.println("Собака играет с трупом кошки! Ужас какой...");
    }
}
