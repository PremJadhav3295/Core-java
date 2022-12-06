package IfElse;

import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age of X :");
        int x = scanner.nextInt();
        System.out.println("Enter the age of Y :");
        int y = scanner.nextInt();
        System.out.println("Enter the age of Z :");
        int z = scanner.nextInt();

        if(x>y && x>z){
            System.out.println("x is oldest");
        }
        else if ((y>x) && (y>z)) {
            System.out.println("y is oldest");
        }
        else if ((z>x) && (z>y)) {
            System.out.println("z is oldest");
        }
        if ((x<y) && (x<z)){
            System.out.println("x is youngest");
        }
        else if ((y<x) && (y<z)) {
            System.out.println("y is youngest");
        }
        else if ((z<x) && (z<y)) {
            System.out.println("z is youngest");
        }
        else{
            System.out.println("All have equal ages");
            System.exit(0);
        }
    }
}
