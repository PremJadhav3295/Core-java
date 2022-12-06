package InputByUser;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter name : ");
        String name = scanner.next();
        System.out.println("Enter roll no. : ");
        int rollno = scanner.nextInt();
        System.out.println("Enter field of interst : ");
        String interest = scanner.next();
        System.out.println("My name is "+name+" and my roll number is "+rollno+" and my field of interest is "+interest);
    }
}
