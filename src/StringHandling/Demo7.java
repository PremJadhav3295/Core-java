package StringHandling;

public class Demo7 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("welcome to string handling to");
        StringBuffer stringBuffer = new StringBuffer();
        String str1 =  new String(stringBuilder);

        String str2 =  new String(stringBuilder);
        String str3 =  new String(stringBuffer);

        StringBuilder stringBuilder1 = new StringBuilder(str1);
        StringBuilder stringBuilder2 = new StringBuilder(stringBuilder);

        StringBuffer stringBuffer1 = new StringBuffer(str1);
        StringBuffer stringBuffer2 = new StringBuffer(stringBuilder);

       /* System.out.println(stringBuilder);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder1);
        System.out.println(stringBuilder2);
        System.out.println(stringBuffer1);
        System.out.println(stringBuffer2);*/

        System.out.println("ABC".equalsIgnoreCase("abc"));
        String greet = "good morning";
        String substring = greet.substring(0,6);
        System.out.println(substring);

    }
}
