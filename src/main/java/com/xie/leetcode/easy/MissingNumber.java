package com.xie.leetcode.easy;

import java.util.HashMap;

/**
 * @author xie4ever
 * @date 2018/12/13 18:58
 */
public class MissingNumber {

    private HashMap<Integer, Boolean> hashMap = new HashMap<Integer, Boolean>();

    public int missingNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], true);
        }
        for (int i = 0; i <= nums.length; i++) {
            if (hashMap.get(i) == null) {
                return i;
            }
        }
        return 1;
    }
}
