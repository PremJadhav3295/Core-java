package Practice;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows needed to print the pattern :");
        int rows = scanner.nextInt();

        System.out.println("##printing the pattern##");

        for (int i=1; i<=rows; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
