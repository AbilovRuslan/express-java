package practice_6;

//Создайте HashSet, содержащий набор имен.
// Напишите программу, которая проверяет,
// содержится ли ваше имя в множестве, и выводит соответствующее сообщение.

import java.util.HashSet;
import java.util.Set;

//cоздай HashSet<String> и добавь туда имена через add()
public class HashSetTask1 {
    public static void main(String[] args) {
        Set<String> nameSet = new HashSet<>();
        //add names
        nameSet.add("Anna");
        nameSet.add("Leo");
        nameSet.add("Serge");
        nameSet.add("Alla");
        nameSet.add("Alex");
        //проверяем имя через contains
        //вводим не через сканер, а руками в коде
        String nameCheck = "Dima";

        if (nameSet.contains(nameCheck)) {
            System.out.println(nameCheck);
        } else {
            System.out.println("нету- " + nameCheck);
        }
    }
}
