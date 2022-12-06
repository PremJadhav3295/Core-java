package Operators;
/*
Suppose the values of variables 'a' and 'b' are 6 and 8 respectively, write two programs to swap the values of the
 two variables.

1 - first program by using a third variable

2 - second program without using any third variable

( Swapping means interchanging the values of the two variables E.g.- If entered value of x is 5 and y is 10 then after
 swapping the value of x and y should become 10 and 5 respectively.)
 */
public class Assignment10 {
    public static void main(String[] args) {
        int a =6 , b=8;
        int c = 0;
        //with use of third variable
        /*c=a;
         a=b;
         b=c;*/
        //without using third variable
       /*
        b=b-a;//2
        a=b+a;//8
        b=a-b;
        */
          a=a+b;
          b=a-b;
          a=a-b;



            System.out.println("A" + a);
            System.out.println("B" + b);

    }
}
