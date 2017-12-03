package com.xie.leetcode.array;

import java.util.Arrays;

/**
 * 
 * @author xie4ever
 *
 */

public class TwoSumDay2 {

	public static int[] twoSum(int[] nums, int target) {

		int[] result = new int[2];

		int i = 0;
		
		for (; i < nums.length; i++) {
			
			int j = i + 1;

			for (; j < nums.length; j++) {

				System.out.println("i=" + i + ", j=" + j);

				if (target - nums[i] == nums[j]) {

					result[0] = i;
					result[1] = j;

					return result;
				}
			}
		}

		return null;
	}

	public static void main(String[] args) {

		// Given nums = [2, 7, 11, 15], target = 9

		int[] nums = new int[] { 11, 2, 15, 7 };
		int target = 9;

		System.out.println(Arrays.toString(twoSum(nums, target)));
	}
}
