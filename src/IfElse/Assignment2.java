package IfElse;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of X :");
        int x = scanner.nextInt();
        System.out.println("Enter the value of Y :");
        int y = scanner.nextInt();

        if(x>y){
            System.out.println("X is greatest number");
        }
        else{
            System.out.println("Y is greatest number");
        }
    }
}
