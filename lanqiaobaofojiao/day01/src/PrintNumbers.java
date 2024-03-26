/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/3/21  19:25
 * Description:
 */

public class PrintNumbers {
    public static void main(String[] args) {
        int start = 1;
        int end = 2020;

        for (int i = start; i <= end; i++) {
            System.out.print(i);
            if (i < end) {
                System.out.print("~");
            }
        }
    }
}

