package com.zddgg.study;

import java.util.HashMap;
import java.util.Map;

/**
 * lc560. 和为 K 的子数组
 */
public class SubarraySum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 3, 8};
        System.out.println(subarraySum(nums, 9));
    }

    public static int subarraySum(int[] nums, int k) {
        int sum = 0, count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
