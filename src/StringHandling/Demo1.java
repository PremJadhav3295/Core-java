package StringHandling;

public class Demo1 {
    public static void main(String[] args) {
        char[] chars = {'1','2','3','4'};
        CharArray charArray = new CharArray();
        charArray.replace(chars, 'A','X');
        for (char ch : chars) {
        System.out.println(ch + " ");
        }
        System.out.println(charArray.length(chars));
    }
}

class CharArray{
    void replace(char[] charArray, char oldChar, char newChar){
        for (int i = 0; i< charArray.length; i++){
            if (charArray[i] == oldChar){
                charArray[i] = newChar;
            }
        }
    }
    char charAt(char[] charArray, int index){
        if(charArray == null) return ' ';
        if(index < 0 || index >= charArray.length)return ' ';
        return charArray[index];
    }

    int length(char[] charArray) {
        if (charArray == null) return 0;
        return charArray.length;
    }
}