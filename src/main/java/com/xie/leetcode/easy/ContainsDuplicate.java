package com.xie.leetcode.easy;

import java.util.HashMap;

/**
 * @author xie4ever
 * @date 2018/12/6 18:13
 */
public class ContainsDuplicate {

    HashMap<Integer, Boolean> hashMap = new HashMap<Integer, Boolean>();

    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 0) {
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                return true;
            }
            hashMap.put(nums[i], true);
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        System.out.println(containsDuplicate.containsDuplicate(new int[]{3, 3}));
    }
}
