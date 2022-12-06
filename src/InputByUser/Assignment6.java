package InputByUser;

import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = scanner.nextInt();

        System.out.println("Square :"+(number*number));
    }
}
