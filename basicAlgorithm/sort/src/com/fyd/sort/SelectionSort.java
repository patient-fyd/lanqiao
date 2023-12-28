package com.fyd.sort;

import java.util.Arrays;

/**
 * @Author: patient.fyd@gmail.com
 * @Description: 选择排序
 * @DateTime: 2023/12/28 15:41
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = new int[]{6, 4, 3, 7, 1};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void selectionSort(int[] array) {
        // 外循环：未排序区间为 [i, n-1]
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            // 内循环：找到未排序区间内的最小元素
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j; // 记录最小元素的索引
                }
            }
            // 将该最小元素与未排序区间的首个元素交换
            if (minIndex != i) {
                array[minIndex] = array[minIndex] ^ array[i];
                array[i] = array[minIndex] ^ array[i];
                array[minIndex] = array[minIndex] ^ array[i];
            }
        }
    }
}
