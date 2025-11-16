package practice_14.task4;

public class GunFactory extends WeaponFactory{
    @Override
    public Weapon createWeapon() {
        return new Gun();
    }

    @Override
    public void prepareWeapon() {
        System.out.println("Заряжаем пистолет патронами...");
    }
}
