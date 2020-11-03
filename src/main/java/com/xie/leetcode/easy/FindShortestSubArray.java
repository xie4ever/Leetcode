package com.xie.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xie4ever
 * @date 2019/7/10 15:12
 */
public class FindShortestSubArray {

    public int findShortestSubArray(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        Map<Integer, Integer> mapIndex = new HashMap<Integer, Integer>();
        Map<Integer, Integer> mapCount = new HashMap<Integer, Integer>();
        int min = 1;
        int cnt = 1;
        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            if (mapIndex.containsKey(key)) {
                int index = mapIndex.get(key);
                int count = mapCount.get(key) + 1;
                if (count == cnt) {
                    cnt = Math.max(count, cnt);
                    min = Math.min(i - index + 1, min);
                } else if (count > cnt) {
                    cnt = Math.max(count, cnt);
                    min = i - index + 1;
                }

                mapCount.put(nums[i], count);

            } else {
                mapIndex.put(nums[i], i);
                mapCount.put(nums[i], 1);
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 2, 3, 1};
        FindShortestSubArray findShortestSubArray = new FindShortestSubArray();
        System.out.println(findShortestSubArray.findShortestSubArray(nums));
    }
}
