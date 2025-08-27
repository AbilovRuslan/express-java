package practice_6;

import java.util.PriorityQueue;

public class PriorityQueueTask {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(6);
        queue.add(23);
        queue.add(45);
        queue.add(29);

        while (!queue.isEmpty()){
            Integer number = queue.poll();
            System.out.println(number);
        }
    }
}
