package StringHandling;

public class Demo6 {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = "abc";
        System.out.println(str1);
        System.out.println(str2);

      //  StringBuilder stringBuilder1 ="abc";
     // StringBuffer stringBuffer = "abc";

        StringBuilder stringBuilder = new StringBuilder("hello ");
        stringBuilder.append("world");
        System.out.println(stringBuilder);
        stringBuilder.delete(0,2);
        System.out.println(stringBuilder);
        stringBuilder.insert(0,"hhhhhhhhhh");
        System.out.println(stringBuilder);
    }
}
