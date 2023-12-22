package com.fyd;

/**
 * @Author: patient.fyd@gmail.com
 * @Description: 小明特别喜欢顺子。顺子指的就是连续的三个数字：123、456 等。顺子日期指的就是在日期的 yyyymmdd 表示法中，存在任意连续的三位数是一个顺子的日期。例如 20220123 就是一个顺子日期，因为它出现了一个顺子：123； 而 20221023 则不是一个顺子日期，它一个顺子也没有。小明想知道在整个 2022 年份中，一共有多少个顺子日期?
 * @DateTime: 2023/12/22 19:17
 */
public class TestDemo6  {
    public static void main(String[] args) {
        String str = "2022";
        int cnt = 0;
        for (int i = 1; i <= 12; i++) {
            int day;
            if (i == 4 | i == 6 | i == 9 | i == 11) {
                day = 30;
            } else if (i == 2) {
                day = 28;
            } else {
                day = 31;
            }

            for (int j = 1; j <= day; j++) {
                String date = str;
                if (i < 10){
                    date += "0";
                }
                date += i;
                if (j < 10) {
                    date += "0";
                }
                date += j;

                // 判断是否是顺子
                for (int k = 0; k <= 5; k++) {
                    if (date.charAt(k + 2) - date.charAt(k + 1) == 1 && date.charAt(k + 1) - date.charAt(k) == 1) {
                        cnt++;
                        System.out.println(date);
                        break;
                    }
                }
            }
        }
        System.out.println(cnt);

    }
}
