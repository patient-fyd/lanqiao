package com.fyd;

import java.util.Scanner;

/**
 * @Author: patient.fyd@gmail.com
 * @Description: 对于输入的每个字符串，查找其中的最大字母，在该字母后面插入字符串 (max)。
 * @DateTime: 2023/12/22 20:19
 */
public class TestDemo8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        String[] strs = new String[t];
        for (int i = 0; i < t; i++) {
            strs[i] = scan.next();
        }
        for (String str : strs) {
            char c = 'a';
            for (int j = 0; j < str.length(); j++) {
                c = (char) Math.max(c, str.charAt(j));
            }
            for (int j = 0; j < str.length(); j++) {
                System.out.print(str.charAt(j));
                if (str.charAt(j) == c) {
                    System.out.print("(max)");
                }
            }
            System.out.println();
        }
        scan.close();
    }
}
