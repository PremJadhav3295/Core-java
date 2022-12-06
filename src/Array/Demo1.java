package Array;

public class Demo1 {
    public static void main(String[] args) {
        int a = 50;//declaration + initialization
        int [] array = new int[10];//declaration + initialization
        int b;//declaration
        b = 40;//initialization

        int[] array1;//declaration
        array1 = new int [5];//initialization
        System.out.println(array);//hashcode or reference
        System.out.println(array1.length);//for length of code =5
        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);
        System.out.println(array1[3]);
        System.out.println(array1[4]);//ArrayIndexOutOfBoundsException
    }
}

