package ExceptionHandling;

public class Demo6 {
    public static void main(String[] args) {

        try {

            String name = "null";
            System.out.println(name);
            System.out.println(name.length());
            System.out.println(10 / 1);
            System.out.println(10 / 1);
            int[] array = new int[3];
            System.out.println(array[4]);

        }catch (NullPointerException nullPointerException){
            System.out.println("String is pointing to null");
        }catch (ArithmeticException arithmeticException){
            System.out.println("Divisor is invalid");
        }catch (Throwable throwable){
            System.out.println("The index limit is less");
        }
        System.out.println("rest of the code");

    }
}
