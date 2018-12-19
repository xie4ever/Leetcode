package com.xie.leetcode.easy;

import java.util.HashMap;

/**
 * @author xie4ever
 * @date 2018/12/18 18:36
 */
public class RangeSumQueryImmutable2 {

    private int[] sums;

    public RangeSumQueryImmutable2(int[] nums) {
        sums = new int[nums.length+1];

        sums[0] = 0;
        for (int i = 1; i <= nums.length; i++) {
            sums[i] += sums[i-1] + nums[i-1];
        }
    }

    public int sumRange(int i, int j) {
        return sums[j+1] - sums[i];
    }
}
