package com.fyd.test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/23  20:51
 * Description:
 */
public class test4 {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        String str = scanner.next();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        // 每个人至少一个糖，最后的就是最大的
        System.out.print(chars[x - 1]);

        // 如果每个人分到的第一个糖都一样，则要继续分配
        if (chars[0] == chars[x - 1]) {
            if (n != x) {
                // 当后面所有的糖相等的时候，则平均分配
                if (chars[x] == chars[n - 1]) {
                    int num = n - x;
                    for (int i = 1; i <= num/x; i++) {
                        System.out.print(chars[x]);
                    }
                    if (num%x != 0) {
                        System.out.print(chars[x]);
                    }
                } else {
                    for (int i = x; i < n; i++) {
                        System.out.print(chars[i]);
                    }
                }
            }
        }
    }
}
