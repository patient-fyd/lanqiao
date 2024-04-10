import java.util.Scanner;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/3/29  11:22
 * Description:
 */
public class vote {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String str = scn.next();
        char[] arr = str.toCharArray();
        int a = 0;
        int b = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] == 'A') {
                a++;
            }else {
                b++;
            }
        }
        System.out.println( a > b ? 'A' : 'B');

    }
}