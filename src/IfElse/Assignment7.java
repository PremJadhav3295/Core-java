package IfElse;

public class Assignment7 {
   static void findAbsolute(int N){
       if(N<0){
           N = (-1) *N;
       }
       System.out.println(N);

   }

    public static void main(String[] args) {
        int N = -12;
        findAbsolute(N);
    }
}
