package Array;

import java.util.Arrays;

public class Demo9ArrayEquality {
    public static void main(String[] args) {
        int[] array1 = {10,20,30,40,50};
        int[] array2 = {10,20,40,50,30};

        boolean isEqual = checkArrayEquality(array1 ,array2);
        System.out.println(isEqual);
    }

    private static boolean checkArrayEquality(int[] array1, int[] array2) {
        if(array1 == null || array2 == null)return false;
        if (array1.length != array2.length)return false;
        if (array1 == array2)return true;
        Arrays.sort(array1);
        Arrays.sort(array2);
        Arrays.equals(array1 , array2);
        for (int index = 0 ; index < array1.length; index++){
            if (array1[index] != array2[index])return false;
        }
        return true;
    }
}
