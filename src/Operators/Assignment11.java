package Operators;
/*
Write a program to convert fahrenheit into celsius.
 */
import java.util.Scanner;

public class Assignment11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float fahrenheit;
        float celsius;
        System.out.println("Enter the fahrenheit :");
        fahrenheit = scanner.nextInt();

        celsius = (fahrenheit-32)*5/9;

        System.out.println("celsius"+celsius);


    }
}
