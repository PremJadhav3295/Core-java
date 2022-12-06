package Operators;

import java.util.Scanner;

/*
Take a 4 digit number. Write a program to display a number whose digits are 2 greater than the corresponding
digits of the number TAKEN.

For example, if the number which was taken is 5696, then the displayed number should be 7818.
 */
public class Assignment14 {
    public static void main(String[] args) {
        int num, first, second, third, fourth,increasedNo ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a num :");
        num = scanner.nextInt();

        first = (num/1000);
        num = num%1000;
        second = (num/100);
        num = num%100;
        third = (num/10);
        num = num%10;
        fourth = (num/1);
        num = num%1;

        increasedNo = (first+2)*1000 + (second+2)*100 + (third+2)*10 + (fourth+2);

        System.out.println(increasedNo);


    }
}
