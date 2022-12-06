package Operators;
/* Length and breadth of a rectangle are 5 and 7 respectively.
   Write a program to calculate the area and the perimeter of the rectangle.

 */
public class Assignment1 {
    public static void main(String[] args) {
        int length = 5 ;
        int breadth = 7 ;
        int area = length * breadth;
        int perimeter = 2*(length + breadth);

        System.out.println("area :"+area);
        System.out.println("perimeter :"+perimeter);
    }
}
