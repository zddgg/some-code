package com.zddgg.study.dp;

/**
 * lc2379. 得到 K 个黑块的最少涂色次数
 */
public class MinimumRecolors {
    public static void main(String[] args) {
        String blocks = "WBBWWBBWBW";
        int k = 7;
        System.out.println(minimumRecolors(blocks, 7));
    }

    public static int minimumRecolors(String blocks, int k) {
        int wNum = 0;
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                wNum++;
            }
        }
        int wMin = wNum;
        for (int i = k; i < blocks.length(); i++) {
            if (blocks.charAt(i) == 'W') {
                wNum++;
            }
            if (blocks.charAt(i - k) == 'W') {
                wNum--;
            }
            wMin = Math.min(wMin, wNum);
        }
        return wMin;
    }
}
