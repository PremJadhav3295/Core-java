package Array;

import java.util.Scanner;

public class Demo4AcceptArray {
    public static void main(String[] args) {
        System.out.println("Enter the array size");
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        System.out.println("Enter the array elements");
        for (int index = 0 ; index < array.length; index++)
        {
            array[index] = scanner.nextInt();
        }
        System.out.println("Printing the array element");
        for (int index = 0 ; index < array.length; index++)
        {
            System.out.println(array[index]);
        }
    }
}
