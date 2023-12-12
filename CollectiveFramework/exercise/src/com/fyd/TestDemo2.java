package com.fyd;

import java.util.Scanner;
import java.util.zip.ZipFile;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2023/12/12  17:00
 * Description: 大小写字母转换
 */
public class TestDemo2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] ^= 32;
            } else if (arr[i] >= 'a' && arr[i] <= 'z') {
                arr[i] ^= 32;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}
