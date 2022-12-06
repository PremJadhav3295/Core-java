package InputByUser;
import java.util.Scanner;

/*
Write a program to take two integer inputs from user and print sum and product of them.
 */
public class Assignment1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A :");
        int A = scanner.nextInt();
        System.out.println("Enter B :");
        int B = scanner.nextInt();

        System.out.println("sum :"+(A+B));
        System.out.println("product :"+(A*B));
    }
}
