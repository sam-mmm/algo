package org.sam.algo;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArraySolution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            int i = Math.abs(nums[j]) - 1;
            nums[i] = -1 * Math.abs(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                list.add(i + 1);
            }
        }
        return list;
    }
}
