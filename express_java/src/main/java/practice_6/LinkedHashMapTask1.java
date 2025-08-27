package practice_6;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTask1 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("first",100);
        linkedHashMap.put("second",200);
        linkedHashMap.put("third",300);
        linkedHashMap.put("forth",400);
        linkedHashMap.put("five",500);

        for (Map.Entry<String,Integer>entry:linkedHashMap.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key +"-" +value);
        }
    }
}
