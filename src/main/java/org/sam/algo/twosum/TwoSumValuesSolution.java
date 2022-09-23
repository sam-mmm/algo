package org.sam.algo.twosum;

import java.util.Arrays;

public class TwoSumValuesSolution {

    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {            
            int sum = nums[left]+nums[right];
            if(sum == target){
                return new int[]{nums[left], nums[right]};
            }else if (sum < target) {
                left++;
            }else if (sum>target){
                right--;
            }
            System.out.println("Foooo");
        }
        return null;
    }
    
}
