package org.sam.algo;

public class FindPivotIndexSolution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total = total + nums[i];
        }
        int left = 0;
        int right = total;
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            if (i > 0) {
                left = left + nums[i - 1];
            }
            right = right - curr;
            if (left == right) {
                return i;
            }
        }
        return -1;
    }
}
