package Array;

public class Demo13ArrayMinElement {
    public static void main(String[] args) {
        int[] array = {12,34,56,85,9};
        System.out.println(minElement(array));

    }

    private static int minElement(int[] array) {
        if(array == null)return -1;
        int min = Integer.MAX_VALUE;
        for (int index = 0; index < array.length; index++){
            if(min > array[index]){
                min = array[index];
            }
        }
        return min;
    }
}
