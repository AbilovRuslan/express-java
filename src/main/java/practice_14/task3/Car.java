package practice_14.task3;

public class Car implements Transport{
    @Override
    public void start() {
        System.out.println("Заводим автомобиль. Двигатель запущен");
    }

    @Override
    public void stop() {
        System.out.println("Останавливаем автомобиль. Двигатель заглушен");
    }

    @Override
    public void description() {
        System.out.println("Автомобиль: 4 колеса, двигатель внутреннего сгорания, 5 мест");
    }
}
