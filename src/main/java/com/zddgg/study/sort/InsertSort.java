package com.zddgg.study.sort;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] nums = {2, 5, 9, 4, 6, 3, 1, 8, 5, 2};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * 按顺序每次取一个基准数，插入在合适的位置，基准数指针下移
     * 基准数的左边为有序数组，右边为待排序数组
     *
     * @param nums
     */
    public static void sort(int[] nums) {
        if (nums.length < 2) {
            return;
        }
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    SortUtil.swap(nums, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }
}
