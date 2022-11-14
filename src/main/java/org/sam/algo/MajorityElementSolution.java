package org.sam.algo;

import java.util.HashMap;

public class MajorityElementSolution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int m = 0;
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            int val = map.getOrDefault(nums[i], 0) + 1;
            map.put(nums[i], val);
            if (val > c) {
                c = val;
                m = nums[i];
            }
        }
        return m;
    }
}
