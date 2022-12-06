package InputByUser;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        double length;
        double breadth;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length : ");
        length=scanner.nextInt();
        System.out.println("Enter breadth : ");
        breadth = scanner.nextInt();
        //type casting
        //int l = (int)length;
       // int b = (int)breadth;
        double area = length*breadth;
        //tc
        int areaf=(int)area;
        System.out.println("area : "+areaf);
    }
}
