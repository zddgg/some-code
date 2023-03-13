package com.zddgg.study;

import java.util.HashMap;
import java.util.Map;

/**
 * lc3. 无重复字符的最长子串
 */
public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        String s = "abba";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        for (int start = 0, end = 0; end < chars.length; end++) {
            if (map.containsKey(chars[end])) {
                // 解决 abba 时 start由第二个b跑到第一个b的问题
                start = Math.max(map.get(chars[end]) + 1, start);
            }
            max = Math.max(max, end - start + 1);
            map.put(chars[end], end);
        }
        return max;
    }
}
