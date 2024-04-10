import java.util.Arrays;
import java.util.Scanner;

public class triad {

    static final int maxN = 100005;
    static int[] a = new int[maxN]; // 用于存储输入的数列

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 读取输入的整数N，表示数列的长度

        // 读取数列的元素
        for (int i = 1; i <= N; ++i) {
            a[i] = scanner.nextInt();
        }

        Arrays.sort(a, 1, N + 1); // 对数列进行排序，从下标1开始排序到下标N

        int low = 1; // 初始化低位指针为1
        long ans = 0; // 初始化结果变量为0

        // 开始循环，处理每个不同的数值
        while (true) {
            int high = low; // 初始化高位指针为低位指针

            // 找到高位指针对应的最后一个相同的数值
            while (high + 1 <= N && a[high + 1] == a[low]) {
                ++high;
            }

            // 计算当前不等三元组的数量，并累加到结果中
            ans += (long) (high - low + 1) * (low - 1) * (N - high);

            low = high + 1; // 更新低位指针为高位指针的下一个位置
            if (low > N) break; // 如果低位指针已经超过了数组长度，跳出循环
        }

        System.out.println(ans); // 输出结果
    }
}
