package com.fyd.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/1/3  16:47
 * Description: 快速排序
 * * 快速排序的核心操作是“哨兵划分”，其目标是：选择数组中的某个元素作为“基准数”，将所有小于基准数的元素移到其左侧，而大于基准数的元素移到其右侧。
 */
public class QuickSort {
    @Test
    public void test() {
        int[] array = new int[]{6, 4, 3, 2, 7, 1};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }


    /* 快速排序 */
    void quickSort(int[] nums, int left, int right) {
        // 子数组长度为 1 时终止递归
        if (left >= right) {
            return;
        }
        // 哨兵划分
        int pivot = partition(nums, left, right);
        // 递归左子数组、右子数组
        quickSort(nums, left, pivot - 1);
        quickSort(nums, pivot + 1, right);
    }

    /* 哨兵划分 */
    int partition(int[] nums, int left, int right) {
        // 以 nums[left] 为基准数
        int i = left, j = right;
        while (i < j) {
            while (i < j && nums[j] >= nums[left]){
                j--;
            } // 从右向左找首个小于基准数的元素
            while (i < j && nums[i] <= nums[left]) {
                i++;
            }// 从左向右找首个大于基准数的元素
            swap(nums, i, j); // 交换这两个元素
        }
        swap(nums, i, left);  // 将基准数交换至两子数组的分界线
        return i;             // 返回基准数的索引
    }

    void swap(int[] nums, int i, int j) {
        nums[i] = nums[i] ^ nums[j];
        nums[j] = nums[i] ^ nums[j];
        nums[i] = nums[i] ^ nums[j];
    }

}
