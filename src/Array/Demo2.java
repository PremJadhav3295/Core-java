package Array;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args){
        int[] marks = {54, 66 , 77, 89, 23};
        System.out.println(marks.length);//length of array
        for (int index = 0; index < marks.length; index++)
        {
            System.out.println(marks[index]);//printing of marks
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Array size");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the array element");
        for(int index = 0 ; index < array.length;  index++)
        {
            array[index] = scanner.nextInt();
        }
        System.out.println("Enter the array element");
        for(int index = 0 ; index < array.length;  index++)
        {
            System.out.println(array[index]);
        }
    }
}
