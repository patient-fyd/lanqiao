import java.util.Scanner;

public class MazeSolver {
    static char[][] arr; // 存储迷宫信息的二维字符数组
    static int[][] vis; // 记录每个位置是否被访问过的二维整型数组
    static int ans = 0; // 记录能够走出迷宫的人数

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arr = new char[10][10]; // 初始化迷宫数组
        for (int i = 0; i < arr.length; i++) {
            String s = sc.next(); // 从控制台读取一行迷宫数据
            arr[i] = s.toCharArray(); // 将字符串转换为字符数组,存储到迷宫数组中
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                vis = new int[10][10]; // 初始化访问记录数组
                dfs(i, j); // 从当前位置开始进行深度优先搜索
            }
        }
        System.out.println(ans); // 输出能够走出迷宫的人数
    }

    public static void dfs(int x, int y) {
        if (x <= -1 || y >= 10 || x >= 10 || y <= -1) { // 检查是否超出迷宫边界
            ans++; // 如果超出边界,说明可以走出迷宫,将ans加1
            return;
        }
        if (vis[y][x] == 1) { // 如果当前位置之前已经被访问过
            return; // 直接返回,不需要继续搜索
        }
        vis[y][x] = 1; // 标记当前位置为已访问
        if (arr[y][x] == 'U') { // 如果当前位置指示牌指向上
            dfs(x, y - 1); // 向上移动一步,继续搜索
        }
        if (arr[y][x] == 'D') { // 如果当前位置指示牌指向下
            dfs(x, y + 1); // 向下移动一步,继续搜索
        }
        if (arr[y][x] == 'L') { // 如果当前位置指示牌指向左
            dfs(x - 1, y); // 向左移动一步,继续搜索
        }
        if (arr[y][x] == 'R') { // 如果当前位置指示牌指向右
            dfs(x + 1, y); // 向右移动一步,继续搜索
        }
    }
}