package com.zddgg.study.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] nums = {2, 5, 9, 4, 6, 3, 1, 8, 5, 2};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * 每次从数组头部开始比较相邻两元素的大小，再按规则交换顺序，
     * 每一轮结束后，数组尾部存放的是最大或最小值
     * 只有相邻元素之间位置可能互换，所以是稳定排序
     * 优化：如果数组冒泡一次结束后，在过程中没有发生元素交换，那么该数组元素已经有序，可以退出循环
     *
     * @param nums
     */
    public static void sort(int[] nums) {
        if (nums.length < 2) {
            return;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            boolean swapFlag = false;
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    SortUtil.swap(nums, j, j + 1);
                    swapFlag = true;
                }
            }
            if (!swapFlag) {
                break;
            }
        }
    }


}
