
package practice_6;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetTask {
    //Создай метод с сигнатурой Set<String> removeDuplicates(List<String> input)
    public static Set<String> removeDuplicates(List<String> input) {
        Set<String> set = new HashSet<>();
        //Добавь все элементы из input в set через addAll() или в цикле
        set.addAll(input);
        //верни созданный set
        return set;
    }

    public static void main(String[] args) {
        //создаем сам список
        List<String> inputList = List.of("мир", "труд", "май", "мир");
        //вызывать метод
        Set<String> resultSet = removeDuplicates(inputList);
        System.out.println(inputList);
        System.out.println(resultSet);

    }

}