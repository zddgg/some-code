package com.zddgg.study;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * lc234. 回文链表
 */
public class IsPalindrome {

    public static void main(String[] args) {
        ListNode head = null;
        ListNode tail = null;
        int[] nums = {1, 2, 3, 1};
        for (int num : nums) {
            if (head == null) {
                head = tail = new ListNode(num);
            } else {
                tail.next = new ListNode(num);
                tail = tail.next;
            }
        }
        System.out.println(isPalindrome(head));
    }

    public static boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int start = 0;
        int end = list.size() - 1;
        while (end >= start) {
            if (!Objects.equals(list.get(start), list.get(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
