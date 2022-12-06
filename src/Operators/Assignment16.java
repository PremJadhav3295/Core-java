package Operators;

import java.util.Scanner;

/*
Write a program to reverse a 3-digit number.
eg. -number: 132 output : 231
 */
public class Assignment16 {
    public static void main(String[] args) {
        int n, first, second, third, reverse;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        n = scanner.nextInt();
        first = n/100;
        n = n%100;

        second = n/10;
        n = n%10;

        third = n/1;
        n = n%1;

       reverse= third*100 + second*10 + first;

        System.out.println("reverse number : "+reverse);


    }
}
