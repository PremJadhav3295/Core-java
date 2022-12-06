package InputByUser;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side :");
        int side = scanner.nextInt();

        System.out.println("Area :"+(side * side)+"\nperimeter :"+(4*side));
    }
}
