package ExceptionHandling;

public class Demo11 {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
            throw  new ArithmeticException("divide by zero........");
        }catch (Exception exception){
            System.out.println("catch");
            System.out.println(10/0);
        } finally {
            System.out.println("finally");
        }
        System.out.println("rest of the code");
    }
}
