package practice_5.Pet;

public class Main {
    public static void main(String[] args) {
        PetManager manager = new PetManager();

        Pet dog = new Dog();
        Pet cat = new Cat();

        //мучаем собаку

        manager.setPet(dog);
        manager.feed();
        manager.interact();

        //работает!

        manager.setPet(cat);
        manager.feed();
        manager.interact();

    }
}
