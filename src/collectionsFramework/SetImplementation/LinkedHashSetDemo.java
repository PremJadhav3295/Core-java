package collectionsFramework.SetImplementation;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set integers = new LinkedHashSet();
        System.out.println(integers.add(10));
        System.out.println(integers.add("abc"));
        System.out.println(integers.add(null));
        System.out.println(integers.add("abc"));
        System.out.println(integers.add(null));
        System.out.println(integers.add(10));
        System.out.println(integers.add(9));
        System.out.println(integers);
    }
}
