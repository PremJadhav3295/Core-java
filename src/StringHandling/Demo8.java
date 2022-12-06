package StringHandling;

import java.util.StringTokenizer;

public class Demo8 {
    public static void main(String[] args) {;
        String str = "welcome:to,cyber,sucess";
        StringTokenizer stringTokenizer = new StringTokenizer(str,":");
        while (stringTokenizer.hasMoreElements()){
            System.out.println(stringTokenizer.nextElement());
        }
    }
}
