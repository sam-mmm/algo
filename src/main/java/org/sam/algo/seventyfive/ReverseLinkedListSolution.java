package org.sam.algo.seventyfive;

import org.sam.algo.ListNode;

public class ReverseLinkedListSolution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
