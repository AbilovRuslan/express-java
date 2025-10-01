package practice_6;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTask {
    public static void main(String[] args) {
        TreeMap<String, Integer> studentScore = new TreeMap<>();

        studentScore.put("Alex", 88);
        studentScore.put("Leo", 56);
        studentScore.put("Anna", 89);
        studentScore.put("Mike", 78);
        studentScore.put("Jack", 90);

        for (Map.Entry<String, Integer> entry : studentScore.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + value);
        }

    }
}
