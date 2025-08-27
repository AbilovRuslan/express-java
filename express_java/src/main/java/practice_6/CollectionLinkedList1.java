package practice_6;

import java.util.LinkedList;

public class CollectionLinkedList1 {
    public static void main(String[] args) {
        LinkedList<String>task = new LinkedList<>();

        //add 3 task
        task.add("Fight!");
        task.add("Sleep!");
        task.add("Eat!");

        //обрабатываем задачи пока не опустеет очередь
        while (!task.isEmpty()){
            String actualTask = task.poll();
            System.out.println(actualTask);
            System.out.println(task.size());//не понимаю, как должен выглядеть вывод...
            //System.out.println("empty");//этот
        }
    }
}
