package com.fyd.sort;

import java.util.Arrays;

/**
 * @Author: patient.fyd@gmail.com
 * @Description: 插入排序
 * @DateTime: 2023/12/28 19:40
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] array = new int[]{6, 4, 3, 7, 1};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void insertionSort(int[] array) {
        // 外循环：已排序元素数量为 1, 2, ..., n
        for (int i = 1; i < array.length; i++) {
            int base = array[i];
            int j = i - 1;
            // 内循环：将 base 插入到已排序部分的正确位置
            while (j >= 0 && array[j] > base) {
                // 将 array[j] 向右移动一位
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = base;
        }
    }
}
