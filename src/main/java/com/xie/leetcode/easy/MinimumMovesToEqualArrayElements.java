package com.xie.leetcode.easy;

/**
 * @author xie4ever
 * @date 2018/12/26 17:52
 */
public class MinimumMovesToEqualArrayElements {

    public int minMoves(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i] - min;
        }
        return total;
    }
}
