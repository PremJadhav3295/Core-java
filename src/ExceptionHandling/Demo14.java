package ExceptionHandling;

import java.util.Scanner;

public class Demo14 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = scanner.nextInt();

        if (age < 18){
            throw new Exception ("You are under 18");
        }else {
            System.out.println("You are eligible for voting");
        }
    }
}
