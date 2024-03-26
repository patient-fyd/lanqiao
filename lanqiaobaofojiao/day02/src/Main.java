import java.util.Scanner;
import java.util.Vector;

public class Main {
    static Vector<String> city = new Vector<String>(); // 用于存储城市名称的向量
    static Vector<Vector<String>> dig = new Vector<Vector<String>>(); // 用于存储对应城市的车站名称的二维向量

    static int Myfind(String s) { // 查找给定城市在city向量中的位置
        for (int i = 0; i < city.size(); i++) {
            if (city.get(i).equals(s)) {
                return i; // 如果找到,返回索引
            }
        }
        return -1; // 如果没找到,返回-1
    }

    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt(); // 输入城市数量n

        for (int i = 0; i < n; i++) {
            String d, c;
            d = in.next(); // 输入车站名称
            c = in.next(); // 输入城市名称

            int flag = Myfind(c); // 查找城市在city向量中的位置
            if (flag == -1) { // 如果城市不存在
                city.addElement(c); // 将城市添加到city向量
                dig.addElement(new Vector<String>()); // 为新城市创建一个车站列表
                dig.get(city.size() - 1).addElement(d); // 将车站添加到对应城市的列表
            } else {
                dig.get(flag).addElement(d); // 如果城市存在,将车站添加到对应城市的列表
            }
        }

        for (int i = 0; i < city.size(); i++) { // 输出结果
            System.out.println(city.get(i) + " " + dig.get(i).size()); // 输出城市名称和该城市的车站数量
            for (int j = 0; j < dig.get(i).size(); j++) {
                System.out.println(dig.get(i).get(j)); // 输出每个车站的名称
            }
        }
    }

}