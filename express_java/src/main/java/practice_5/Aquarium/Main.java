package practice_5.Aquarium;

public class Main {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();

        aquarium.setCreature(new Shark());
        aquarium.showMove();
        aquarium.setCreature(new Starfish());
        aquarium.showMove();
    }
}
