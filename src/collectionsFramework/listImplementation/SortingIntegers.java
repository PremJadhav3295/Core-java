package collectionsFramework.listImplementation;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingIntegers {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(18);
        integerList.add(10);
        integerList.add(15);
        integerList.add(11);
        integerList.add(19);
        integerList.add(20);


        System.out.println(integerList);
        System.out.println("Sorted list :");

        Collections.sort(integerList);
        System.out.println(integerList);
    }

}
