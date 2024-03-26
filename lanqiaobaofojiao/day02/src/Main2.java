import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main2 {
    static Queue<String> V = new LinkedList<String>(); // 创建VIP队列
    static Queue<String> N = new LinkedList<String>(); // 创建普通队列

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int M = in.nextInt(); // 读入指令个数

        while (M > 0) { // 处理每个指令
            M--;
            String op, name, type;
            op = in.next(); // 读入指令

            if (op.contains("IN")) { // 如果是入队指令
                name = in.next(); // 读入用户名
                type = in.next(); // 读入用户类型
                if (type.contains("V")) {
                    V.offer(name); // 将用户名入队到VIP队列
                } else {
                    N.offer(name); // 将用户名入队到普通队列
                }
            } else { // 如果是出队指令
                type = in.next(); // 读入用户类型
                if (type.contains("V")) {
                    V.poll(); // 将VIP队列队首元素出队
                } else {
                    N.poll(); // 将普通队列队首元素出队
                }
            }
        }

        while (V.size() != 0) { // 输出VIP队列
            System.out.println(V.poll());
        }

        while (N.size() != 0) { // 输出普通队列
            System.out.println(N.poll());
        }
    }
}