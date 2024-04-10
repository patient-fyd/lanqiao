import java.util.*;

class State {
    int[][] board;
    int x, y; // 空格的位置
    int steps; // 移动步数

    public State(int[][] board, int x, int y, int steps) {
        this.board = board;
        this.x = x;
        this.y = y;
        this.steps = steps;
    }
}

public class Main {
    public static final int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}}; // 可移动的方向

    public static int bfs(int[][] target, int[][] start) {
        Queue<State> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        int n = start.length;
        int m = start[0].length;

        // 将起始状态加入队列
        int sx = 0, sy = 0;
        outer:
        for (sx = 0; sx < n; sx++) {
            for (sy = 0; sy < m; sy++) {
                if (start[sx][sy] == 0) {
                    break outer;
                }
            }
        }
        queue.offer(new State(start, sx, sy, 0));
        visited.add(Arrays.deepToString(start));

        // BFS搜索
        while (!queue.isEmpty()) {
            State cur = queue.poll();

            // 判断是否到达目标状态
            if (Arrays.deepEquals(cur.board, target)) {
                return cur.steps;
            }

            // 扩展当前状态
            for (int[] dir : dirs) {
                int nx = cur.x + dir[0];
                int ny = cur.y + dir[1];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    int[][] newBoard = new int[n][m];
                    for (int i = 0; i < n; i++) {
                        newBoard[i] = Arrays.copyOf(cur.board[i], m);
                    }
                    // 交换空格和相邻数字的位置
                    int temp = newBoard[cur.x][cur.y];
                    newBoard[cur.x][cur.y] = newBoard[nx][ny];
                    newBoard[nx][ny] = temp;

                    // 判断新状态是否已访问过
                    if (!visited.contains(Arrays.deepToString(newBoard))) {
                        visited.add(Arrays.deepToString(newBoard));
                        queue.offer(new State(newBoard, nx, ny, cur.steps + 1));
                    }
                }
            }
        }

        // 无法到达目标状态
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] target = new int[3][3];
        int[][] start = new int[3][3];

        // 读取目标状态
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                target[i][j] = scanner.nextInt();
            }
        }

        // 读取起始状态
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                start[i][j] = scanner.nextInt();
            }
        }

        // 使用BFS算法求解
        int steps = bfs(target, start);
        System.out.println(steps);

        scanner.close();
    }
}
