package practice_6;

import java.util.ArrayList;

//Создаем ArrayList
public class CollectionArray {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Я");
        strings.add("ты");
        strings.add("они");

        //Ищем самое то слово длинное
        //объявим переменную
        String longest = "";
        for (String str : strings) {
            if (str.length() > longest.length()) {
                longest = str;
            }
        }
        System.out.println(longest);
    }
}