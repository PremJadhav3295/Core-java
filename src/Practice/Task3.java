package Practice;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the rows needed :");
        int rows = scanner.nextInt();

        System.out.println("##Printing pattern##");
        for(int i=1; i<=rows; i++){

            for(int j=rows; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
