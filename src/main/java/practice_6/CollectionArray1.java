package practice_6;

import java.util.ArrayList;

//Создаем ArrayList

public class CollectionArray1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(12);
        numbers.add(22);
        numbers.add(32);

        //Выводим сумму
        int sum = 0;//объявляем переменную
        for (
                int num : numbers) {
            sum += num;
        }
        System.out.println(sum);

    }
}