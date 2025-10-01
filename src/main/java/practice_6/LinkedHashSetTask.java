package practice_6;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTask {
    public static void main(String[] args) {
        //создаем LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("First");
        linkedHashSet.add("Second");
        linkedHashSet.add("Third");
        linkedHashSet.add("Forth");
        linkedHashSet.add("Five");
        //вывод
        System.out.println(linkedHashSet);
    }
}
