package IfElse;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Quantity :");
        int x = scanner.nextInt();
        if((x*100)>1000){
            System.out.println("You get discount of"+ (.1*x*100)+ "and your total cost is" + (x*100-(.1*x*100)));
        }
        else{
            System.out.println("No discount");
        }
    }
}
