package com.fyd;

import java.util.Scanner;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2023/12/12  16:04
 * Description:
 * 输人n个整数 a1,a2,a3....an，求这n个数的最大值max,最小值min,
 * 以及 ai-al绝对值的最大值(i!=j)(n<=1000 .ai<=1000)
 * 实例:
 *      输入 5
 *          1 2 3 4 5
 *      输出 5 1 4
 */
public class TestDemo1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        int max = 0,min = Integer.MAX_VALUE,abs = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        for (int j = 0; j < n; j++) {
            max = Math.max(max,arr[j]);
            min = Math.min(min,arr[j]);
        }
        abs = Math.abs(max - min);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("abs = " + abs);


    }
}
