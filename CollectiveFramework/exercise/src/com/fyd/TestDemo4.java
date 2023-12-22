package com.fyd;

import java.util.Scanner;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2023/12/19  20:13
 * Description: 给定一个正整数，输出这个正整数以内的质数和质数的个数
 */
public class TestDemo4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int count = 0;
        for (int i = 2; i <= n; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
                System.out.print(i+" ");
            }
        }
        System.out.println("\t"+count);
    }
}
