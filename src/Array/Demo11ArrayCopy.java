package Array;

public class Demo11ArrayCopy {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};

        int[] array2 = createArrayCopy(array1);
        for (int temp : array2){
            System.out.println(temp);
        }
    }

    private static int[] createArrayCopy(int[] array1) {
        if (array1 == null)return new int[0];
        int[]result = new int[array1.length];
        for (int i = 0 ; i < array1.length; i++){
            result[i] = array1[i];
        }
        return result;
    }
}
