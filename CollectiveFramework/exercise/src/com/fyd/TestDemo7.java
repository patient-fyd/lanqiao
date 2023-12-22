package com.fyd;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: patient.fyd@gmail.com
 * @Description: 所谓“三带一”牌型，即四张手牌中，有三张牌一样，另外一张不与其他牌相同，换种说法，四张手牌经过重新排列后，可以组成 AAAB牌型，
 * @DateTime: 2023/12/22 19:45
 */
public class TestDemo7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t;
        t = scan.nextInt();
        for (int i = 1; i <= t ; i++) {
            String str = scan.next();
            // 字符串转字符数组
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            int cnt = 0;
            if (chars[0] == chars[2]) {
                cnt++;
            }
            if (chars[1] == chars[3]) {
                cnt++;
            }
            if (cnt == 1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
