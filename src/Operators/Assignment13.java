package Operators;

import java.util.Scanner;

/*
Write a program to calculate the sum of the first and the second last digit of a 5 digit number.
eg. input 12345 output 1+4=5
 */
public class Assignment13 {
    public static void main(String[] args) {
        int n, first, second, third, fourth, fifth, sum;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N number :");

        n = scanner.nextInt();
        first = n/10000;
        n = n%10000;
        second = n/1000;
        n = n%1000;
        third = n/100;
        n = n%100;
        fourth = n/10;
        n = n%10;
        fifth = n/1;
        n = n%1;

        sum = first + fifth;
        System.out.println("Sum :"+sum);
    }
}
