package ExceptionHandling;

public class Demo7 {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }catch (ArithmeticException arithmeticException){
            System.out.println("custom handler");
        }
        System.out.println("rest of the code");
    }
}
