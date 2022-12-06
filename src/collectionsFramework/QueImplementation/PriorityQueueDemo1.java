package collectionsFramework.QueImplementation;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo1 {
    public static void main(String[] args) {
        Queue queue = new PriorityQueue();

        queue.add(15);
        queue.add(1);
        queue.add(19);
        queue.add(500);
        queue.add(3);
        queue.add(2);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
