import java.util.Scanner;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/3/29  16:06
 * Description:
 */
public class count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        count(n, 0);
    }

    static void count(int n, int ans) {
        if (n == 0) {
            System.out.println(ans);
        }
        if (n > 0) {
            count(n / 10, ans + 1);
        }
    }
}
