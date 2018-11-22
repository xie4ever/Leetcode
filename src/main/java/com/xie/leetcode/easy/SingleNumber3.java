package com.xie.leetcode.easy;

/**
 * @author xie4ever
 * @date 2018/11/21 19:36
 */
public class SingleNumber3 {

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int j = 0; j < 32; j++) {
            int bits = 0;
            for (int i = 0; i < nums.length; i++) {
                bits += (nums[i] >> j) & 1;
            }
            result |= (bits % 3) << j;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 2, 2, 3, 1, 1};
        SingleNumber3 singleNumber = new SingleNumber3();
        System.out.println(singleNumber.singleNumber(nums));
    }
}
