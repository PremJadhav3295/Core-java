package collectionsFramework.SetImplementation;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        Set integers = new TreeSet();
        System.out.println(integers.add(10));
        System.out.println(integers.add(10));
        System.out.println(integers.add(9));
        //System.out.println(integers.add(null)); it gives NullPointerException
        //System.out.println(integers.add("abc"));

        System.out.println(integers.add(-2));
        System.out.println(integers);
    }
}
