package practice_6;

import java.util.HashMap;
import java.util.Map;

public class HashMapTask1 {
    public static void printUnderage(Map<String, Integer> map) {
        System.out.println("Младше 18лет:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() < 18) {
                String name = entry.getKey();
                Integer age = entry.getValue();
                System.out.println(name + age);
            }
        }

    }

    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<>();

        people = new HashMap<>();
        people.put("Leo", 17);
        people.put("Anna", 23);
        people.put("Zoe", 45);
        people.put("Elena", 56);
        people.put("Sam", 78);

        System.out.println(people);

        printUnderage(people);
    }

}
