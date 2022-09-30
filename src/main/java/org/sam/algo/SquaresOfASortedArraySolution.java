package org.sam.algo;

import java.util.Arrays;

public class SquaresOfASortedArraySolution {
    public int[] sortedSquares1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public int[] sortedSquares2(int[] nums) {
        int[] val = new int[nums.length];
        int start = 0;
        int end = nums.length - 1;
        int index = end;
        while (start <= end) {
            if (Math.abs(nums[start]) < Math.abs(nums[end])) {
                val[index] = nums[end] * nums[end];
                end--;
                index--;
            } else {
                val[index] = nums[start] * nums[start];
                start++;
                index--;
            }
        }
        return val;
    }
}
