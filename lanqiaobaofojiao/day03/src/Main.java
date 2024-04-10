import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(partition(n, k));
    }

    public static int partition(int n, int k) {
        if (n == 0 || k == 0 || n < k) {
            return 0;
        }
        if (k == 1 || n == k){
            return 1;
        } else {
            return partition(n - k, k) + partition(n - 1, k-1);
        }
    }
}
