package com.zddgg.study.dp;

import java.util.Arrays;

public class MaxValue {
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 5}, {3, 2, 1}};
        System.out.println(maxValue(nums));
    }

    /**
     * 输入:
     * [
     * [1,3,1],
     * [1,5,1],
     * [4,2,1]
     * ]
     * 输出: 12
     * 解释: 路径 1→3→5→2→1 可以拿到最多价值的礼物
     *
     * @param grid
     * @return
     */
    public static int maxValue(int[][] grid) {
        int[][] dp = new int[grid.length + 1][grid[0].length + 1];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (i == 0 && j == 0) {
                    dp[1][1] = grid[0][0];
                } else {
                    if (i == 0) {
                        dp[i + 1][j + 1] = grid[i][j] + dp[i + 1][j];
                    } else if (j == 0) {
                        dp[i + 1][j + 1] = grid[i][j] + dp[i][j + 1];
                    } else {
                        dp[i + 1][j + 1] = grid[i][j] + Math.max(dp[i][j + 1], dp[i + 1][j]);
                    }
                }
            }
        }
        for (int[] ints : dp) {
            System.out.println(Arrays.toString(ints));
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }
}
