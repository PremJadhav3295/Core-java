package ControlStatement;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {

        int breadth;
        int width;
        int area;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Breadth :");
        breadth = scanner.nextInt();

        System.out.println("Enter the width :");
        width = scanner.nextInt();

        area = (breadth*width)/2;//Formula for calculating area
        System.out.println("Area of Triangle :"+area);

        scanner.close();

    }
}
