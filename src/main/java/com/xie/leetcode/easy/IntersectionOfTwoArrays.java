package com.xie.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author xie4ever
 * @date 2018/12/19 15:47
 */
public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Map<Integer, Integer> resultMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], 0);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i])) {
                resultMap.put(nums2[i], 0);
            }
        }
        int i = 0;
        int[] result = new int[resultMap.size()];
        for (Integer key : resultMap.keySet()) {
            result[i] = key;
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] num1 = new int[]{1,2,2,1};
        int[] num2 = new int[]{2,2};
        System.out.println(Arrays.toString(new IntersectionOfTwoArrays().intersection(num1, num2)));
    }
}
