package com.fyd.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/3/5  16:53
 * Description: 图书排序
 */
public class test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 读取输入
        int N = scanner.nextInt();
        int[] bookIds = new int[N];
        int[] weights = new int[N];

        for (int i = 0; i < N; i++) {
            bookIds[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }

        // 使用希尔排序按权重排序书籍
        shellSortByWeights(bookIds, weights);

        // 输出排序后的书籍 ID
        for (int bookId : bookIds) {
            System.out.println(bookId);
        }
    }

    // 希尔排序按照权重排序书籍
    private static void shellSortByWeights(int[] bookIds, int[] weights) {
        int n = weights.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                for (int j = i - gap; j >= 0 && weights[j + gap] < weights[j]; j -= gap) {
                    swap(bookIds, j, j + gap);
                    swap(weights, j, j + gap);
                }
            }
        }
    }
    private static void swap(int[] arr, int j, int i) {
        arr[i] = arr[i]^arr[j];
        arr[j] = arr[i]^arr[j];
        arr[i] = arr[i]^arr[j];
    }
}
