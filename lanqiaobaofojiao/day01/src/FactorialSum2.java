public class FactorialSum2 {

    public static long INF = 10000000000L;

    public static void main(String[] args) {
        long sum = 0;
        for (int i = 1; i <= 40; i++) {
            sum = sum + fact(i);
        }
        System.out.println(sum % 1000000000);
    }

    public static long fact(int n) {
        long sum1 = 1;
        for (long i = 1; i <= n; i++) {
            sum1 = sum1 * i;
            if (sum1 >= INF) sum1 = sum1 % INF;
        }
        return sum1;
    }
}
