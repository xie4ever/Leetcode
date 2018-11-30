package com.xie.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xie4ever
 * @date 2018/11/26 17:53
 */
public class MajorityElement2 {

    public int majorityElement(int[] nums) {
        int count = 1;
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (temp == nums[i]) {
                count++;
            } else {
                count--;
                if (i + 1 == nums.length) {
                    return temp;
                }
                if (count == 0) {
                    temp = nums[i + 1];
                    count = 0;
                }
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 2, 1, 1, 1, 2, 2};
        MajorityElement2 majorityElement = new MajorityElement2();
        System.out.println(majorityElement.majorityElement(nums));
    }
}
