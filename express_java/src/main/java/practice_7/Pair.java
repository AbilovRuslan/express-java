package practice_7;

public class Pair<T, U> {
    private T first;
    private U second;

    public void setFirst(T first) {
        this.first = first;
    }

    public T getFirst() {
        return first;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public U getSecond() {
        return second;
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>();
        System.out.println(pair1.getFirst());
        System.out.println(pair1.getSecond());

        Pair<String, Double> pair2 = new Pair<>();
        pair2.setFirst("P1");
        pair2.setSecond(3.22);
        System.out.println(pair2.getSecond());
        System.out.println(pair2.getFirst());

    }
}
