package InputByUser;

import java.util.Scanner;

public class Assignment10 {
    public static void main(String[] args) {
        int sub1, sub2, sub3, total, percentage;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the marks of sub1 :");
        sub1 = scanner.nextInt();

        System.out.println("Enter the marks of sub2 :");
        sub2 = scanner.nextInt();

        System.out.println("Enter the marks of sub3 :");
        sub3 = scanner.nextInt();

        total = sub1+sub2+sub3;
        percentage = (total/(300))*100;

        System.out.println("total :"+total);
        System.out.println("percentage :"+percentage);
    }
}
