package org.sam.algo.seventyfive;

import java.util.Arrays;

public class LongestConsecutiveSequenceSolution {
    public int longestConsecutive(int[] nums) {
        int ans = 0;
        int temp = 0;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (Math.abs(nums[i] - nums[i - 1]) == 1) {
                if (temp == 0) {
                    temp++;
                }
                temp++;
            } else if (Math.abs(nums[i] - nums[i - 1]) != 0) {
                if (temp > ans) {
                    ans = temp;
                }
                temp = 0;
            }
        }
        if (temp > ans) {
            ans = temp;
        }
        if (nums.length == 1) {
            ans = 1;
        }
        return ans;
    }
}
