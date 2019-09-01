package com.tomoyadeng.codeplayground.easy;

/**
 * 给定一个链表，判断链表中是否有环
 */
public class CircleList {
    /**
     * 解法： 快慢指针相遇即有环
     */
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
