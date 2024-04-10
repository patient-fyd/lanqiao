import java.math.BigInteger;

public class Test {

    final static int x = 2;
    final static int y = 3;

    public static void main(String[] args) {

        Long a = 2L;
        Long b = 3L;
        Long sum = 0L;
        Long pre = 0L;

        for (int i = 2; i <= 123456; ++i) {
            sum = a * y + b * x;
            pre = a * x - b * y;
            a = pre;
            b = sum;
        }
        System.out.println(a + "  " + b + "i");
        
    }

}