package collectionsFramework.mapImplementations;

import java.util.HashMap;
import java.util.Map;

public class HashmapDemo1 {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put(11,"abc");
        map.put(10,"pqrs");
        map.put(9,"xyz");
        map.put(12,"abc");
        map.put(8,"Abc");
        map.put(8,"c");
        map.put(21,"null");
        map.put(5,"null");
        System.out.println(map);
        System.out.println(map.remove(21));
        System.out.println(map);
        System.out.println("Key is present or not :"+map.containsKey(5));
        System.out.println("Key is present or not :"+map.containsKey(4));

    }
}
