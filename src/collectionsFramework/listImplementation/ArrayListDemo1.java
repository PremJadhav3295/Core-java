package collectionsFramework.listImplementation;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list.add(100));
        list.add(100);
        list.add(100);
        list.add(100);
        list.add(100);
        list.add('a');
        list.add("string");
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
    }
}
