import java.math.BigInteger;

public class FactorialSum {
    public static void main(String[] args) {
        BigInteger sum = BigInteger.valueOf(0);//初始化0
        for(int i = 1; i <= 50; i ++) {
            BigInteger sum1 = BigInteger.valueOf(1);
            for(int j = 1; j <= i; j ++) {
                sum1 = sum1.multiply(BigInteger.valueOf(j));//乘法
            }
            sum = sum.add(sum1);
        }
        System.out.println(sum);//最后复制最后九位数即是答案。
    }
}