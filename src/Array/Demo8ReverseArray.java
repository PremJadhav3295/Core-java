package Array;

public class Demo8ReverseArray {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5};
        reverseArray(number);
    }

    private static void reverseArray(int[] number) {
        if(number == null){
            return;
        }
         for (int left = 0 , right = number.length-1;left < right; left++,right--){
             int temp = number[left];
             number[left] = number[right];
             number[right] = temp;
         }
         for (int index = 0 ; index < number.length; index++){
             System.out.print(number[index] + " ");
         }


    }
}
