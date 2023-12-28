package com.fyd.sort;

import java.util.Arrays;

/**
 * @Author: patient.fyd@gmail.com
 * @Description: 冒泡排序
 * @DateTime: 2023/12/28 15:29
 */
public class BubblingSort {

    public static void main(String[] args) {
        int[] array = new int[]{6, 4, 3, 7, 1};
        bubblingSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void bubblingSort(int[] array) {
        // 外循环：未排序区间为 [0, i]
        for (int i = 0; i < array.length; i++) {
            // 内循环：将未排序区间 [0, i] 中的最大元素交换至该区间的最右端
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    array[j] = array[j] ^ array[i];
                    array[i] = array[j] ^ array[i];
                    array[j] = array[j] ^ array[i];
                }
            }
        }
    }
}
