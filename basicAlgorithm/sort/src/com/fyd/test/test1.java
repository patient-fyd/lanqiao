package com.fyd.test;

import java.util.Scanner;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/23  16:05
 * Description: 宝藏排序1（归并排序）
 */
public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int newArr[] = mergeSort(a, 0, n - 1);
        for (int i : newArr) {
            System.out.print(i + " ");
        }

    }

    public static int[] mergeSort(int[] a, int left, int right) {
        if (left == right) {
            return new int[]{a[left]};
        }
        int mid = (left + right) / 2;
        int[] leftArr = mergeSort(a, left, mid);
        int[] rightArr = mergeSort(a, mid + 1, right);
        int[] newNum = new int[leftArr.length + rightArr.length];

        int m = 0;
        int i = 0;
        int j = 0;
        while (i < leftArr.length && j < rightArr.length) {
            newNum[m++] = leftArr[i] < rightArr[j] ? leftArr[i++] : rightArr[j++];
        }
        while (i < leftArr.length) {
            newNum[m++] = leftArr[i++];
        }
        while (j < rightArr.length) {
            newNum[m++] = rightArr[j++];
        }
        return newNum;
    }
}
