package Array;

public class Demo7SumOfArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,19};
        System.out.println(arraySum(array));
    }

    private static int arraySum(int[] array) {
    int sum = 0;
    if(array == null){
        return sum;
    }
    for (int index = 0; index < array.length; index++){
        sum = sum + array[index];
    }
    return sum;
    }
}
