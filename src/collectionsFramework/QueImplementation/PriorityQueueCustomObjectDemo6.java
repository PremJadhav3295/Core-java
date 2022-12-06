package collectionsFramework.QueImplementation;

import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueCustomObjectDemo6 {
    public static void main(String[] args) {
        Queue<Employee> queue = new PriorityQueue<>();
        queue.add(new Employee(11,"abc",2000));
        queue.add(new Employee(10,"pqr",7000));
        queue.add(new Employee(15,"def",1000));
        queue.add(new Employee(5,"xyz",500));
        queue.add(new Employee(1,"lmn",700));

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());


    }
}
