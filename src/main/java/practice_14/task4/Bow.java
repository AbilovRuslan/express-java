package practice_14.task4;

public class Bow implements Weapon{
    @Override
    public void attack() {
        System.out.println("Лук! Как стрелять то?");
    }

    @Override
    public void description() {
        System.out.println("Лук: деревянная основа, тетива. Брать будешь?");
    }
}
