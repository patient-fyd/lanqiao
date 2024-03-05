package com.fyd.sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/3/5  15:38
 * Description: 希尔排序
 */
public class ShellSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void sort(int[] arr) {
        //增量gap，并逐步缩小增量
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            //从第gap个元素，逐个对其所在组进行直接插入排序操作
            for (int i = gap; i < arr.length; i++) {
                for (int j = i - gap;j >= 0 && arr[j] > arr[j + gap];j -= gap) {
                    //插入排序采用交换法
                    swap(arr, j, j + gap);
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
