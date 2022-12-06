package collectionsFramework.QueImplementation;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo2 {
    public static void main(String[] args) {
        Queue queue = new PriorityQueue();

        queue.add("symbol");
        queue.add("chars");
        queue.add("python");
        queue.add("java");

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
