package InputByUser;

import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the number");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c= scanner.nextInt();

        int result1 = (a==b)?a:b;
        boolean result2 = (result1==c)?true:false;


        if(result2==true) {
            System.out.println("All are equal");
        }
        else if(((a==b)&& (b==c) ||(a==c)||(a==b))){
            System.out.println("Any of the two are equal");
        }


    }
}
