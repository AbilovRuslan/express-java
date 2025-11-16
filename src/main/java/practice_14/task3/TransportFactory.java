package practice_14.task3;

abstract public class TransportFactory {
    public abstract Transport createTransport();

    public void prepareForUse() {
        System.out.println("Подготовка транспортного средства к использованию...");
    }
}
