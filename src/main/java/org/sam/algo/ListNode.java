package org.sam.algo;

import java.util.ArrayList;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode node(Integer[] arr) {
        ListNode node = null;
        for (int i = arr.length - 1; i >= 0; i--) {
            node = new ListNode(arr[i], node);
        }
        return node;
    }

    public static Integer[] array(ListNode node) {
        ArrayList<Integer> list = new ArrayList<>();
        while (node != null) {
            list.add(node.val);
            node = node.next;
        }
        return list.toArray(new Integer[0]);
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
