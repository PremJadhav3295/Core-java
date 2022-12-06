package collectionsFramework.QueImplementation;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListDemo {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
       // System.out.println(queue.remove()); No such element Exception

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.peek());




    }
}
