package IfElse;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int years;
        int salary;
        double d;
        System.out.println("Enter total years of service :");
        years = scanner.nextInt();
        System.out.println("Congrats..YES..! your total year of service is more than 5 years");
        System.out.println("Please enter your salary :");
        salary = scanner.nextInt();


        if(years>5){
            System.out.println("Your salary is :"+salary);
            System.out.println("Your 5% bonus is :"+salary*0.05);
            System.out.println("Your net bonus is :"+(salary+(salary*0.05)));
        }
        else{
            System.out.println("NO BONUS...");
        }

    }
}
