package practice_6;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTask {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        //add numbers
        numbers.add(12);
        numbers.add(13);
        numbers.add(33);
        numbers.add(56);

        int point = 1;

        //метод higher / lower
        Integer higher = numbers.higher(point);
        Integer lower = numbers.lower(point);

        //output Set
        System.out.println(numbers);
        System.out.println(point);

        if (lower != null) {
            System.out.println(lower);
        } else {
            System.out.println("nope");
        }

    }
}
