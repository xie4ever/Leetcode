package com.xie.leetcode.easy;

/**
 * @author xie4ever
 * @date 2019/7/25 16:45
 */
public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int max = 0;
        int temp = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                if (nums[i] == 1) {
                    temp++;
                    if (temp > max) {
                        max = temp;
                        break;
                    }
                }
            }

            if (nums[i] == 1) {
                temp++;
            } else {
                if (temp > max) {
                    max = temp;
                    temp = 0;
                } else {
                    temp = 0;
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] sums = new int[]{1,0,1,1,0,1};
        System.out.println(new MaxConsecutiveOnes().findMaxConsecutiveOnes(sums));
    }
}
