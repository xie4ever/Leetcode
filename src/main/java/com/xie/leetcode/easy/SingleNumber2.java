package com.xie.leetcode.easy;

/**
 * @author xie4ever
 * @date 2018/11/21 19:36
 */
public class SingleNumber2 {

    public int singleNumber(int[] nums) {
        int length = nums.length;
        int result = 0;
        for (int i = 0; i < length; i++) {
            result ^= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 2};
        SingleNumber2 singleNumber2 = new SingleNumber2();
        System.out.println(singleNumber2.singleNumber(nums));
    }
}
