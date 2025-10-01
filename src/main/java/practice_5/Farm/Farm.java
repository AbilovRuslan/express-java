package practice_5.Farm;

public class Farm {
    private FarmAnimal animal;

    public void setAnimal(FarmAnimal animal) {
        this.animal = animal;
    }

    public void manageAnimal() {
        animal.feed();
        animal.care();
        animal.produce();
    }
}
