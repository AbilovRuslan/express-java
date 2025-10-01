package practice_5.Aquarium;

public class Aquarium {
    public SeaCreature creature;

    public void setCreature(SeaCreature creature) {
        this.creature = creature;
    }

    public void showMove() {
        creature.move();
    }
}
