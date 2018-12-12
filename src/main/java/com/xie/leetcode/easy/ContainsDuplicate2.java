package com.xie.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author xie4ever
 * @date 2018/12/6 18:13
 */
public class ContainsDuplicate2 {

    HashMap<Integer, List<Integer>> hashMap = new HashMap<Integer, List<Integer>>();

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length == 0) {
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            List<Integer> list = hashMap.get(nums[i]);
            if (list == null) {
                list = new ArrayList<Integer>();
                list.add(i);
                hashMap.put(nums[i], list);
            } else {
                list.add(i);
            }
        }

        if (hashMap.size() == nums.length) {
            return false;
        }

        boolean flag = false;

        for (Integer i : hashMap.keySet()) {
            List<Integer> list = hashMap.get(i);
            if (list.size() == 1) {
                continue;
            }
            for (int j = 0; j < list.size() - 1; j++) {
                if (Math.abs(list.get(j) - list.get(j + 1)) <= k) {
                    flag = true;
                }
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        ContainsDuplicate2 containsDuplicate = new ContainsDuplicate2();
        System.out.println(containsDuplicate.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
    }
}
