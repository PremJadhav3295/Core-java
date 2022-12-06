package Operators;
/*
if the marks of robert in three subjects are 78,45 and 62 respectively (each out of 100 )
write a program to calculate his total marks and percentage marks.
 */
public class Assignment9 {
    public static void main(String[] args) {
        int sub1 = 78;
        int sub2 = 45;
        int sub3 = 62;
        int total;
        total = sub1 + sub2 + sub3;

        float percentage;
        percentage = (total * 100)/300;

        System.out.println("total :"+total );
        System.out.println("percentage :"+percentage );
    }
}
