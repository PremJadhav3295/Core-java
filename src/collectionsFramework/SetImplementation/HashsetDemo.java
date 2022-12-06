package collectionsFramework.SetImplementation;

import java.util.HashSet;
import java.util.Set;

public class HashsetDemo {
    public static void main(String[] args) {


        Set integers = new HashSet<>();
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
