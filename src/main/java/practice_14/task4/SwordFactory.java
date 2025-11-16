package practice_14.task4;

public class SwordFactory extends WeaponFactory{
    @Override
    public Weapon createWeapon() {
        return new Sword();
    }

    @Override
    public void prepareWeapon() {
        System.out.println("Затачиваем клинок меча...");
    }
}
