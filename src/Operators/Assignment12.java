package Operators;
/*
The total number of students in a class are 90 out of which 45 are boys.

If 50% of the total students secured grade 'A' out of which 20 are boys, then write a program to calculate the
 total number of girls getting grade 'A'.
 */
public class Assignment12 {
    public static void main(String[] args) {
        int totalstudents = 90;
        int boys = 45;
        int girls = totalstudents - boys;
        int boysgettingAgrade = 20;
        int totalstudentsgettingAgrade = (totalstudents * 50)/100;
        int girlsgettingAgrade = totalstudentsgettingAgrade - boysgettingAgrade;
        System.out.println("Total number of girls getting A grade :"+girlsgettingAgrade);
    }
}
