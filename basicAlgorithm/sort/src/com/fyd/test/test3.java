package com.fyd.test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/23  20:23
 * Description: 小花的零花钱
 */
public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b = scanner.nextInt();
        int count = 0;
        int[] a = new int[105];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        // 每次切割的花费
        int[] cost = new int[105];
        int j = 1;

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                count++;
            } else {
                count--;
            }
            // count等于零的时候代表这个位置可以被分割
            if (count == 0) {
                cost[j++] = Math.abs(a[i + 1] - a[i]);
            }
        }
        Arrays.sort(cost,1,j);
        int ans = 0;
        for (int i = 0; i < j; i++) {
            if (b >= cost[i]){
                ans++;
                b -= cost[i];
            }
        }
        System.out.println(ans);
    }
}
