package practice_14.task4;

public class Gun implements Weapon{
    @Override
    public void attack() {
        System.out.println("Пушка -ракета");
    }

    @Override
    public void description() {
        System.out.println("Пистолет: стальной корпус! Не продается");
    }
}
