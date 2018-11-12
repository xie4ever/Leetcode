package com.xie.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xie4ever
 */
public class DegreeOAnArray {

    public static int findShortestSubArray(int[] nums) {
        Map<Integer, int[]> map = new HashMap<Integer, int[]>();

        int appearTimes = 0;
        int minLength = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                // 更新该元素最后出现的位置
                map.get(nums[i])[1] = i;
                // 更新该元素的出现次数
                map.get(nums[i])[2]++;
            } else {
                // 第一次存在HashMap中，记录信息
                int[] info = new int[3];

                info[0] = i; // 记录最初的位置
                info[1] = i; // 记录最后的位置
                info[2] = 1; // 记录出现次数

                map.put(nums[i], info);
            }
            appearTimes = Math.max(appearTimes, map.get(nums[i])[2]); // 找到最多出现次数的元素
        }

        for (int num : map.keySet()) {
            if (appearTimes == map.get(num)[2]) {
                minLength = Math.min(minLength, map.get(num)[1] - map.get(num)[0] + 1);
            }
        }
        return minLength;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 2, 3, 1};
        int[] nums2 = new int[]{1, 2, 2, 3, 1, 1};

        System.out.println(findShortestSubArray(nums1));
        System.out.println(findShortestSubArray(nums2));
    }
}
