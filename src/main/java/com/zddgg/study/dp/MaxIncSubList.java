package com.zddgg.study.dp;

import java.util.Arrays;

public class MaxIncSubList {

    public static void main(String[] args) {

        int[] nums = {1, 3, -1, 5, 7, 3, 6, 9, 10, -1};
        System.out.println(Arrays.toString(maxIncSubList(nums)));
    }

    public static int[] maxIncSubList(int[] arr) {
        int[] dp = new int[arr.length];
        Arrays.fill(dp, 1);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                dp[i] = dp[i - 1] + 1;
            }
        }
        int maxLen = 0;
        int maxIndex = 0;
        for (int i = 0; i < dp.length; i++) {
            if (dp[i] > maxLen) {
                maxLen = dp[i];
                maxIndex = i;
            }
        }
        int[] res = new int[maxLen];
        for (int i = 0; i < res.length; i++) {
            res[i] = arr[maxIndex - maxLen + 1 + i];
        }
        return res;
    }
}
