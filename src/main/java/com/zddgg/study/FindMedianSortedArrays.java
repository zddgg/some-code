package com.zddgg.study;

/**
 * lc4. 寻找两个正序数组的中位数
 */
public class FindMedianSortedArrays {

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        boolean flag = len % 2 == 0;
        int i1 = 0, i2 = 0;
        double mid = 0;
        int midTmp = 0;
        for (int i = 0; i < (len / 2) + 1; i++) {
            int tmpNUm;
            if (i1 == nums1.length) {
                tmpNUm = nums2[i2++];
            } else if (i2 == nums2.length) {
                tmpNUm = nums1[i1++];
            } else if (nums1[i1] < nums2[i2]) {
                tmpNUm = nums1[i1++];
            } else {
                tmpNUm = nums2[i2++];
            }
            if (i == (len / 2)) {
                mid = tmpNUm;
            }
            if (flag && i == (len / 2) - 1) {
                midTmp = tmpNUm;
            }
        }
        return flag ? (mid + midTmp) / 2 : mid;
    }
}
