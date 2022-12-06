package ExceptionHandling;

import static java.awt.AWTEventMulticaster.add;

public class Demo15 {
    public static void main(String[] args) {
        assert (add(10,20) == 30);
    }

    static int add(int i, int i1) {

        return i + i1;
    }
}
