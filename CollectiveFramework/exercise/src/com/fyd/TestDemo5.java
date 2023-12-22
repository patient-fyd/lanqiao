package com.fyd;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author: patient.fyd@gmail.com
 * @Description: 小明又新学了一个概念，叫做完美序列。一个仅包合数字序列被称为完美序列，当且仅当数字序列中每个数字出现的次数等于这个数字。比如(1)，(2,2,3,3,3)。空序列也算。现在小明得到了一个数字序列，他想知道最少要删除多少个数字才能使得这个数字序列成为一个完美序列。
 * @DateTime: 2023/12/22 18:50
 */
public class TestDemo5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] data = new int[100005];
        for (int i = 1; i <= n; i++) {
            data[i] = scan.nextInt();
        }
        Arrays.sort(data,1,n+1);
        Map<Integer, Integer> map = new HashMap<>();
        int cnt = 1;
        for (int i = 2; i <= n; i++) {
            if (data[i] == data[i - 1]) {
                cnt++;
            } else {
                map.put(data[i - 1], cnt);
                cnt = 1;
            }
        }
        map.put(data[n], cnt);
        int ans = 0;
        for (int x : map.keySet()) {
            cnt = map.get(x);
            if (cnt > x) {
                ans += cnt - x;
            } else if (cnt < x) {
                ans += cnt;
            }
        }
        System.out.println(ans);
    }
}
