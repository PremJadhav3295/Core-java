package Practice;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows needed :");
        int rows = scanner.nextInt();

        System.out.println("##Printing pattern");

        for (int i=1; i<=rows; i++)
        {
            //j is for space
            for(int j=rows; j>i; j--)
            {
                System.out.print(" ");
            }
            for(int k =1; k<=i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
