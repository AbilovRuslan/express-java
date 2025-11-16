package practice_14.task3;

public class CarFactory extends TransportFactory{
    @Override
    public Transport createTransport() {
        return new Car();
    }

    @Override
    public void prepareForUse() {
        System.out.println("Проверяем уровень масла...пинаем колесо 3 раза");
    }
}
