package com.zddgg.study;

/**
 * lc70. 爬楼梯
 */
public class ClimbStairs {

    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }

    public static int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[dp.length - 1];
    }
}
