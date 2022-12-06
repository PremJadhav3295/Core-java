package Operators;
/*Write a program to add 8 to the number 2345 and then divide it by 3.
Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5.
Display the final result.

 */
public class Assignment3 {
    public static void main(String[] args) {
        int num = 2345;
        /*int num1 = num + 8 ;
        int num2 = num1 / 3 ;
        int num3 = num2 % 5 ;
        int result = num3 * 5 */



        System.out.println("result :"+(((num+8)/3)%5)*5);
        //System.out.println("result :"+result);

    }
}
