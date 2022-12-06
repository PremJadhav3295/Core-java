package ControlStatement;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        int radius;
        double pi = 3.14 , area ;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of circle :");
        radius = scanner.nextInt();

        area = pi * radius * radius;// Formula for calculating area of circle
        System.out.println("Area of circle :"+area);

        scanner.close();
    }


}
