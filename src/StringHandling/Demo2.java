package StringHandling;

public class Demo2 {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");
        String str3 = "xyz";
        String str4 = "abc";
        String str5 = "abc";
        String str6 = "xyz";

        System.out.println(str1.toString());
        System.out.println(str1);
        System.out.println(str1.length());
        System.out.println(str1.equals(str2));
    }
}
