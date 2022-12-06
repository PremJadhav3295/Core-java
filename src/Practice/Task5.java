package Practice;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the rows needed :");
        int rows = scanner.nextInt();

        System.out.println("##Printing the pattern##");

        for(int i=1; i<=rows;i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i=1; i<=rows; i++) {
            for (int j = rows-1; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
