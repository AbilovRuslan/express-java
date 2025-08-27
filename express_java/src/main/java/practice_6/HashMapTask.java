package practice_6;

import java.util.HashMap;
import java.util.Map;

public class HashMapTask {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<>();

        people.put("Leo", 20);
        people.put("Anna", 23);
        people.put("Zoe", 45);
        people.put("Elena", 56);
        people.put("Sam", 78);

        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            String name = entry.getKey();
            Integer age = entry.getValue();
            System.out.println(name + age);
        }
    }
}
