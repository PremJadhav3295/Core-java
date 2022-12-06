package collectionsFramework.QueImplementation;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        queue.add(100);
        queue.add(200);
        queue.add(300);
        queue.add(400);

       // System.out.println(queue.peek());
        //System.out.println(queue.remove());
       // System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println("queue :"+queue);
    }
}
