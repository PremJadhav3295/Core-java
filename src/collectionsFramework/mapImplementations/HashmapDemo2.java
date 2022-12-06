package collectionsFramework.mapImplementations;

import java.util.HashMap;

public class HashmapDemo2 {
    public static void main(String[] args) {
        //Find the occurrence of each character in the given String
        String str = " Tushar Ramesh Rathod";
        str = str.trim();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(Character ch : str.toCharArray()){
            if(hashMap.containsKey(ch)){
                hashMap.put(ch, hashMap.get(ch)+1);
            }
            else {
                hashMap.put(ch,1);
            }
        }
        System.out.println(hashMap);
    }
}
