package collectionsFramework.mapImplementations;

import java.util.HashMap;

public class HashmapDemo3 {
    public static void main(String[] args) {


        // find the occurrence of each word in the given String
        String str = "java is easy but need regular practice and attention java";
        String[] strings = str.trim().split(" ");
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String word : strings) {
            if (!hashMap.containsKey(word)) {
                hashMap.put(word, 1);
            } else {
                hashMap.put(word, hashMap.get(word) + 1);
            }
        }
        System.out.println(hashMap);

    }
}
