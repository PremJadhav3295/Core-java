package collectionsFramework.QueImplementation;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo4 {
    public static void main(String[] args) {
         Queue<String> queue = new PriorityQueue<>(Comparator.reverseOrder());
        /*Queue<String> queue = new PriorityQueue<>(new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o1);
            }
        });
        Queue<String> queue = new PriorityQueue<>((o1,o2) -> o2.compareTo(o1));*/

        queue.add("gama");
        queue.add("alpha");
        queue.add("beta");
        queue.add("chars");
        System.out.println(queue);
    }
}
