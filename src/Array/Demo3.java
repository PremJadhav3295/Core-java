package Array;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args){

        int[] array = {1,2,3,4,5};
        System.out.println("Array 2 :"+array.length);

        /* int[] array = new int[5];
        System.out.println("array"+array.length);*/

        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;

       for (int index = 0 ; index < array.length; index++){
            System.out.println(array[index]);//print the array index
        }
    }
}
