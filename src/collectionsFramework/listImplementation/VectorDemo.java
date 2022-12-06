package collectionsFramework.listImplementation;

import java.util.List;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        List list =new Vector();
        System.out.println(list.add(10));
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add("string");
        list.add('a');
        list.add(false);
        list.add(null);
        list.add(null);
        System.out.println(list.size());
        System.out.println(list);
        list.remove("string");
        System.out.println(list);
        System.out.println(list.isEmpty());
        Object[] objects = list.toArray();
        System.out.println(list.contains('a'));
        System.out.println("Astring".codePointAt(0));
    }
}
