package collectionsFramework.mapImplementations;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethod {
    public static void main(String[] args) {
        Map<String, Integer> marks = new HashMap<>();
        marks.put("vikaram",96);
        marks.put("akshay",36);
        marks.put("rahul",55);
        marks.put("ajay",39);
        marks.put("alpha",67);

        Set<String> keys = marks.keySet();
        System.out.println(keys);// key Set

        Collection<Integer> values = marks.values();
        System.out.println(values);// Value Set

        Set<Map.Entry<String, Integer>> entries = marks.entrySet();//Entry Set
        System.out.println("How many entries we have :"+entries.size());

        for (Map.Entry<String, Integer> entry: entries) {
            System.out.println(entry.getKey()+"\t"+entry.getValue());
        }

    }
}
