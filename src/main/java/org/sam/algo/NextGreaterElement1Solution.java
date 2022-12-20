package org.sam.algo;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement1Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = -1;
            map.put(nums1[i], i);
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums2.length; i++) {
            int cur = nums2[i];
            while (!stack.empty() && cur > stack.peek()) {
                int val = stack.pop();
                int idx = map.get(val);
                ans[idx] = cur;
            }
            if (map.containsKey(cur)) {
                stack.push(cur);
            }
        }
        return ans;
    }
}
