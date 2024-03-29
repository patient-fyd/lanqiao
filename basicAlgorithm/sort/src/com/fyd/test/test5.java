package com.fyd.test;

import java.util.Scanner;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/24  17:21
 * Description: 第k个数
 */
public class test5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int ans = 1; // 1就是最小的字典序，所以初始化为1
        k--; // 直接扣除上面是1的情况
        while (k > 0) {
            // temp表示当前前缀范围有多少数  now表示当前前缀，next表示下一前缀
            long temp = 0;
            int now = ans;
            int next = ans + 1;
            // 满足在n的范围内
            while (now <= n) {
                temp += Math.min(n + 1, next) - now;
                next *= 10;
                now *= 10;
            }
            if (temp<= k){
                ans+=1;
                k-=temp;
            }else {
                ans*=10;
                k-=1;
            }
        }
        System.out.println(ans);
    }
}
