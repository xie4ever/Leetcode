package com.xie.leetcode.easy;

import java.util.HashMap;

/**
 * @author xie4ever
 * @date 2018/11/21 19:27
 */
public class SingleNumber {

    HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

    public int singleNumber(int[] nums) {
        if (nums == null) {
            return 0;
        }

        for (int i = 0; i < nums.length; i++) {
            Integer times = hashMap.get(nums[i]);
            if (times != null) {
                hashMap.put(nums[i], times + 1);
                continue;
            } else {
                hashMap.put(nums[i], 1);
            }
        }

        for (Integer key : hashMap.keySet()) {
            if (hashMap.get(key) == 1) {
                return key;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 2};
        SingleNumber singleNumber = new SingleNumber();
        System.out.println(singleNumber.singleNumber(nums));
    }
}
