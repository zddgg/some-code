package com.zddgg.study;

/**
 * lc19. 删除链表的倒数第 N 个结点
 */
public class RemoveNthFromEnd {
    public static void main(String[] args) {
        ListNode head = null;
        ListNode tail = null;
        for (int i = 1; i < 6; i++) {
            if (head == null) {
                head = tail = new ListNode(i);
            } else {
                tail.next = new ListNode(i);
                tail = tail.next;
            }
        }
        ListNode node = removeNthFromEnd(head, 2);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode first = head;
        ListNode second = dummy;
        for (int i = 0; i < n; ++i) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }
}
