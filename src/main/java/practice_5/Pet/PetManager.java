package practice_5.Pet;

public class PetManager {
    private Pet pet;

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void feed() {
        pet.feed();
    }

    public void interact() {
        pet.interact();
    }


}
