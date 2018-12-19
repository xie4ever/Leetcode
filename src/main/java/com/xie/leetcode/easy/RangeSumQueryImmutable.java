package com.xie.leetcode.easy;

import java.util.HashMap;

/**
 * @author xie4ever
 * @date 2018/12/18 18:24
 */
public class RangeSumQueryImmutable {

    private HashMap<String,Integer> hashMap;
    private int[] nums;

    public RangeSumQueryImmutable(int[] nums) {
        this.nums = nums;
        this.hashMap = new HashMap<String, Integer>();
    }

    public int sumRange(int i, int j) {
        String key = i + "_" + j;
        if (this.hashMap.containsKey(key)) {
            return hashMap.get(key);
        }
        if (i >= this.nums.length || j >= this.nums.length) {
            return 0;
        }
        if (i > j) {
            return 0;
        }
        if (i == j) {
            return this.nums[i];
        }
        int result = 0;
        while (i <= j) {
            result += this.nums[i];
            i++;
        }
        this.hashMap.put(key, result);
        return result;
    }

    public static void main(String[] args) {

    }
}
