package practice_14.task3;

public class BicycleFactory extends TransportFactory{
    @Override
    public Transport createTransport() {
        return new Bicycle();
    }

    @Override
    public void prepareForUse() {
        System.out.println("Проверяем давление в шинах, смазываем цепь велосипеда...а руля нет!");
    }
}
