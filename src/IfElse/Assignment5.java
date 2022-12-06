package IfElse;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks of math :");
        int math = scanner.nextInt();
        System.out.println("Enter the marks of math :");
        int sci = scanner.nextInt();
        System.out.println("Enter the marks of math :");
        int eng = scanner.nextInt();
        System.out.println("Enter the marks of math :");
        int mar = scanner.nextInt();

        int total = math + sci + eng + mar ;

        int percentage = (total*100)/400;

        System.out.println("total :"+total);
        System.out.println("percentage :"+percentage);

        if(percentage<25){
            System.out.println("Fail");
        }
        else if (26<=percentage && percentage<=45) {
            System.out.println("Grade E");
        }
        else if (46<=percentage && percentage<=50) {
            System.out.println("Grade D");
        }
        else if (51<=percentage && percentage<=60) {
            System.out.println("Grade C");
        }
        else if (61<=percentage && percentage<=80) {
            System.out.println("Grdae B");
        }
        else  {
            System.out.println("Grade A");
        }
    }
}
