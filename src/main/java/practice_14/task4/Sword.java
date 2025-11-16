package practice_14.task4;

public class Sword implements Weapon{
    @Override
    public void attack() {
        System.out.println("Щас как мячом то всеку!");
    }

    @Override
    public void description() {
        System.out.println("Меч: стальной клинок, острое лезвие, цены немалой");
    }
}
