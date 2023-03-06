package com.zddgg.study.sort;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] nums = {2, 5, 9, 4, 6, 3, 1, 8, 5, 2};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * 数组每完成一次比较后，确定一个全局最大或最小值，直接放到合适位置
     * 后面在比较其他数据，确定下一个最大或最小值
     *
     * @param nums
     */
    public static void sort(int[] nums) {
        if (nums.length < 2) {
            return;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                SortUtil.swap(nums, i, minIndex);
            }
        }
    }
}
