package InputByUser;

import java.util.Scanner;

/*
 1. Take a two integer inputs from user.
 2. First calculate the sum of two then product of two.
 3, Finally , print the sum and product of both obtained results.
 */
public class Assignment2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x:");
        int x = scanner.nextInt();
        System.out.println("Enter y:");
        int y = scanner.nextInt();
        int sum = x+y;
        int product = x*y;

        System.out.println("sum :"+sum+"\nproduct :"+product);
    }
}
