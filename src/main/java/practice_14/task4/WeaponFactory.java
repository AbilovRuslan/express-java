package practice_14.task4;

abstract class WeaponFactory {
    public abstract Weapon createWeapon();

    public void prepareWeapon() {
        System.out.println("Подготовка оружия к использованию...");
    }
}
