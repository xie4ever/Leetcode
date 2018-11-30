package com.xie.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xie4ever
 * @date 2018/11/26 17:45
 */
public class MajorityElement {

    Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    public int majorityElement(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }

        for (int i = 0; i < nums.length; i++) {
            Integer times = map.get(nums[i]);
            if (times == null) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], times + 1);
            }
        }

        for (Integer key : map.keySet()) {
            int times = map.get(key);
            if (times > length / 2) {
                return key;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 2, 1, 1, 1, 2, 2};
        MajorityElement majorityElement = new MajorityElement();
        System.out.println(majorityElement.majorityElement(nums));
    }
}
