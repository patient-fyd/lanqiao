import java.util.Scanner;

public class excel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 读取输入的行数和列数
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        scanner.nextLine(); // 消耗掉换行符

        // 创建一个二维数组来存储数据
        int[][] data = new int[rows][cols];

        // 读取输入的数据
        for (int i = 0; i < rows; i++) {
            String[] split = scanner.nextLine().split("\\s+");
            for (int j = 0; j < cols; j++) {
                data[i][j] = Integer.parseInt(split[j]);
            }
        }

        // 读取输入的公式
        String formula = scanner.nextLine();

        // 计算公式结果
        int result = calculateFormula(data, formula, rows, cols);
        System.out.println(result);
    }

    private static int calculateFormula(int[][] data, String formula, int rows, int cols) {
        String[] cells = formula.replace("=", "").split("\\+");
        int result = 0;
        for (String cell : cells) {
            int row = Integer.parseInt(cell.replaceAll("\\D", "")) - 1;
            int col = cell.replaceAll("\\d", "").toUpperCase().charAt(0) - 'A';
            if (row >= 0 && row < rows && col >= 0 && col < cols) {
                result += data[row][col];
            }
        }
        return result;
    }
}