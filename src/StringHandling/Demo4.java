package StringHandling;

public class Demo4 {
    public static void main(String[] args) {
        String str = "A string handling is a easy topic";
        str = str.replace('a','@');
        System.out.println(str);
        str = str.replace("e@sy","h@rd");
        System.out.println("Replaced string :"+str);
        System.out.println(str.charAt(2));
        System.out.println(str.codePointAt(2));
        System.out.println(str.isEmpty());
        System.out.println(str.startsWith("A"));
        System.out.println(str.endsWith("topic"));
        char[] chars = str.toCharArray();
        String str1 = new String(new char[]{'A','B'});
        System.out.println(str1);
    }
}
