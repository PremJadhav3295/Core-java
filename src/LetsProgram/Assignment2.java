package LetsProgram;

import java.util.Scanner;

/* Write a program to print the following on screen
*
**
***
 */
public class Assignment2 {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter number of rows needed :");
       int rows = scanner.nextInt();

        System.out.println("##Printing pattern##");



        for (int i=1; i<=rows; i++){

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
