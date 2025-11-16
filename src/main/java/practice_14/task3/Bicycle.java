package practice_14.task3;

public class Bicycle implements Transport{
    @Override
    public void start() {
        System.out.println("Начинаем движение на велосипеде. Крутим педали");
    }

    @Override
    public void stop() {
        System.out.println("Останавливаем велосипед. Тормозим");
    }

    @Override
    public void description() {
        System.out.println("Велосипед: 2 колеса, педальный привод, руль, седло");
    }
}
