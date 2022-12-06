package collectionsFramework.QueImplementation;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo3 {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Alpha");
        queue.add("bete");
        queue.add("gama");
        queue.add("chars");

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
