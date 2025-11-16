package practice_14.task8;

public class Character {

    private final String magic;
    private final int health;
    private final int armor;

    public Character(String magic, int health, int armor) {
        this.magic = magic;
        this.health = health;
        this.armor = armor;
    }

    public String getMagic() {
        return magic;
    }

    public int getHealth() {
        return health;
    }

    public int getArmor() {
        return armor;
    }
}
