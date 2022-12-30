package org.sam.algo.seventyfive;

import org.sam.algo.ListNode;

public class LinkedListCycleSolution {
    public boolean hasCycle(ListNode head) {
/**
 * Hard to create test cases, Not available.
 * */
        if (head == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }

            slow = slow.next;
            fast = fast.next.next;
        }
        return true;

    }
}
