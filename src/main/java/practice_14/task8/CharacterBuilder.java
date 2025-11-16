package practice_14.task8;

public class CharacterBuilder {
    private String magic;
    private int health;
    private int armor;

    public CharacterBuilder addMagic(String magic) {
        this.magic = magic;
        return this;
    }

    public CharacterBuilder addHealth(int health) {
        this.health = health;
        return this;
    }

    public CharacterBuilder addArmor(int armor) {
        this.armor = armor;
        return this;
    }

    public Character build() {
        return new Character( magic, health, armor);
    }
}
