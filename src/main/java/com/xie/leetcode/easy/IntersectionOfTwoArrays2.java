package com.xie.leetcode.easy;

import java.util.*;

/**
 * @author xie4ever
 * @date 2018/12/19 15:58
 */
public class IntersectionOfTwoArrays2 {

    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums1.length; i++) {
            if (!map1.containsKey(nums1[i])) {
                map1.put(nums1[i], 1);
            } else {
                int num = map1.get(nums1[i]);
                map1.put(nums1[i], num + 1);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if (!map2.containsKey(nums2[i])) {
                map2.put(nums2[i], 1);
            } else {
                int num = map2.get(nums2[i]);
                map2.put(nums2[i], num + 1);
            }
        }
        List<Integer> list = new ArrayList<Integer>();
        for (Integer key : map2.keySet()) {
            if (map1.containsKey(key)) {
                int num1 = map1.get(key);
                int num2 = map2.get(key);
                int num = Math.min(num1, num2);
                for (int i = 0; i < num; i++) {
                    list.add(key);
                }
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] num1 = new int[]{1,2,2,1};
        int[] num2 = new int[]{2,2};
        System.out.println(Arrays.toString(new IntersectionOfTwoArrays2().intersect(num1, num2)));
    }
}
