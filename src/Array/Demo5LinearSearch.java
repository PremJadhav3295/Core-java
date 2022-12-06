package Array;

public class Demo5LinearSearch {
    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,5};
        int key = 5;
        System.out.println(linearSearch(array, key) ? "present" : "Absent");
    }

    private static boolean linearSearch(int[] array, int key) {
        if(array==null){
            return false;
        }
        for (int index = 0 ; index < array.length; index++){
            if (array[index] == key){
                return true;
            }
        }
    return false;
    }
}
