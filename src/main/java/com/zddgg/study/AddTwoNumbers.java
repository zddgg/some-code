package com.zddgg.study;

/**
 * lc2. 两数相加
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        int[] l1Arr = {2, 4, 3};
        int[] l2Arr = {5, 6, 4};
        ListNode l1 = new ListNode(2);
        l1.next= new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next= new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode listNode = addTwoNumbers(l1, l2);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail = null;
        while (l1 != null || l2 != null) {
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            if (head == null) {
                head = tail = new ListNode(n1 + n2);
            } else {
                tail.next = new ListNode(n1 + n2);
                tail = tail.next;
            }
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        ListNode tmp = new ListNode(-1, head);
        while (head != null){
            if (head.val >= 10) {
                head.val = head.val % 10;
                if (head.next != null) {
                    head.next.val = head.next.val + 1;
                } else {
                    head.next = new ListNode(1);
                    break;
                }
            }
            head = head.next;
        }
        return tmp.next;
    }
}
