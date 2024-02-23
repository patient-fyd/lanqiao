package com.fyd.test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/23  19:43
 * Description: 最小化战斗力差距
 */
public class test2 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] w = new int[100005];
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }
        Arrays.sort(w,1,n+1);
        int ans = w[2]-w[1];
        for (int i = 2; i < n; i++) {
            ans = Math.min(ans,w[i+1]-w[i]);
        }
        System.out.println(ans);

    }
}
