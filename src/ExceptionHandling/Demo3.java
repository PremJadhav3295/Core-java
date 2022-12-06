package ExceptionHandling;

public class Demo3 {
    public static void main(String[] args) {
      try {
          System.out.println(10 / 1);
          System.out.println(10 / 1);

          String str = null;// Null Pointer Exception
          System.out.println(str.length());
      }catch(NullPointerException nullPointerException){
          System.out.println("String is pointing to null");
      }catch (ArithmeticException arithmeticException){
          System.out.println("Divisor is invalid");
      }
        System.out.println("rest of the code");


    }
}
