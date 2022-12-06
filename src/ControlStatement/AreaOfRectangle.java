package ControlStatement;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        int length;
        int breadth;
        int area;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length :");
        length = scanner.nextInt();

        System.out.println("Enter the breadth :");
        breadth = scanner.nextInt();

        scanner.close();

        area = length * breadth;//Formula for calculating area
        System.out.println("Area of rectangle :"+area);

    }
}
