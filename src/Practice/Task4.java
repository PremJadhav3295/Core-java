package Practice;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows needed to print the pattern :");
        int rows = scanner.nextInt();

        System.out.println("##printing the pattern##");

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("");
            }
            for (int k = rows; k>=i; k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
