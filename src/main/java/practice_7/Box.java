package practice_7;

public class Box<T> {
    private T item;

    public void set(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.set(100);
        System.out.println(integerBox.get());

        Box<String> stringBox = new Box<>();
        stringBox.set("Hello");
        System.out.println(stringBox.get());

        Box<Double> doubleBox = new Box<>();
        doubleBox.set(3.12);
        System.out.println(doubleBox.get());
    }
}
