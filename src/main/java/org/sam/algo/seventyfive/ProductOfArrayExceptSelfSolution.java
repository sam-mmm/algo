package org.sam.algo.seventyfive;

public class ProductOfArrayExceptSelfSolution {
    public int[] productExceptSelf1(int[] nums) {
        int zeros = 0;
        int sum = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                sum = sum * nums[i];
            } else {
                zeros++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0 && zeros == 1) {
                nums[i] = sum;
            } else if (zeros > 0) {
                nums[i] = 0;
            } else {
                nums[i] = sum / nums[i];
            }
        }
        return nums;
    }

    public int[] productExceptSelf2(int[] nums) {
        int length = nums.length;

        int[] l = new int[length];
        int[] r = new int[length];

        int[] ans = new int[length];

        l[0] = 1;
        r[length - 1] = 1;

        for (int i = 1; i < length; i++) {
            l[i] = nums[i - 1] * l[i - 1];
        }
        for (int i = length - 2; i >= 0; i--) {
            r[i] = nums[i + 1] * r[i + 1];
        }
        for (int i = 0; i < length; i++) {
            ans[i] = l[i] * r[i];
        }

        return ans;
    }

    public int[] productExceptSelf3(int[] nums) {
        int length = nums.length;
        int[] ans = new int[length];

        ans[0] = 1;

        for (int i = 1; i < length; i++) {
            ans[i] = nums[i - 1] * ans[i - 1];
        }
        int r = 1;
        for (int i = length - 1; i >= 0; i--) {
            ans[i] = r * ans[i];
            r = r * nums[i];
        }

        return ans;
    }
}
