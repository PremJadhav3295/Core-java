package Operators;

import java.util.Scanner;
/*
Write a program to calculate the sum of the digits of a 3-digit number.
eg. number : 555 output : 15;
 */
public class Assignment15 {

    public static void main(String[] args) {
        int n , first, second, third, sum;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number : ");
        n = scanner.nextInt();

        first = n/100;
        n = n%100;

        second = n/10;
        n = n%10;

        third = n/1;
        n = n%1;

        sum = first + second + third;
        System.out.println("sum : "+sum);
    }
}
