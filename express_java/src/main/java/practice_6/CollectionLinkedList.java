package practice_6;

import java.util.LinkedList;

public class CollectionLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();//создаем LinkedList
        //add 5 strings
        list.add("Hello!");
        list.add("it's");
        list.add("me!");
        list.add("asshole!");
        //вывести
        System.out.println(list);
    }
}
