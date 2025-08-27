package practice_6;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeTask {
    public static void main(String[] args) {
        Deque<String> arrayDeque = new ArrayDeque<>();

        arrayDeque.add("first");
        arrayDeque.add("second");
        arrayDeque.add("third");
        arrayDeque.add("fourth");
        arrayDeque.add("five");

        for (String element : arrayDeque) {
            System.out.println(element);
        }
    }
}
