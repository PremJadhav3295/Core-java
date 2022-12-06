package InputByUser;

import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System. in );
        System.out.println("Enter the number :");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(a<50 && a<b){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
