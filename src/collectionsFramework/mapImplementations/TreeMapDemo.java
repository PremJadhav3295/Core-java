package collectionsFramework.mapImplementations;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> marks = new TreeMap<>();
        marks.put("vikaram",96);
        marks.put("akshay",36);
        marks.put("rahul",55);
        marks.put("ajay",39);
        marks.put("alpha",67);

        System.out.println(marks);
        System.out.println(marks.size());
    }
}
