package collectionsFramework.mapImplementations;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> marks = new LinkedHashMap<>();
        marks.put("vikaram",96);
        marks.put("akshay",36);
        marks.put("rahul",55);
        marks.put("ajay",39);
        marks.put("alpha",67);

        System.out.println(marks);
    }
}
