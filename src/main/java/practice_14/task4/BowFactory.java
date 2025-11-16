package practice_14.task4;

public class BowFactory extends WeaponFactory{
    @Override
    public Weapon createWeapon() {
        return new Bow();
    }

    @Override
    public void prepareWeapon() {
        System.out.println("Натягиваем тетиву лука...");
    }
}
