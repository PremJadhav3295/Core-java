package IfElse;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length :");
        int length = scanner.nextInt();
        System.out.println("Enter the breadth :");
        int breadth = scanner.nextInt();
        if(length==breadth){
            System.out.println("Square");
        }
        else{
            System.out.println("Rectangle");
        }

    }
}
