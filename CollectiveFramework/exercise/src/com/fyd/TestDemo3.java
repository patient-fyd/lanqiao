package com.fyd;

import java.util.Scanner;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2023/12/12  17:21
 * Description:
 */
public class TestDemo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int data[] = new int[200];
        for(int i = 0 ; i < 200 ; i ++) data[i] = 4 * i + 6;

        int num = scan.nextInt();

        int left = 0;
        int right = data.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (data[mid] == num) {
                System.out.println(mid);
                break;
            } else if (data[mid] < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

    }
}
