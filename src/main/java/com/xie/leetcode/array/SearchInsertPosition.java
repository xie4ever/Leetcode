package com.xie.leetcode.array;

/**
 * @author xie4ever
 * @date 2018/11/15 23:04
 */
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        if (target < nums[0]) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 == nums.length) {
                if (target > nums[i]) {
                    result = i + 1;
                    break;
                } else {
                    result = i;
                    break;
                }
            }
            int a = nums[i];
            int b = nums[i + 1];
            if (target <= a) {
                return i;
            } else if (target > a && target < b) {
                result = i + 1;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5, 6};
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        System.out.println(searchInsertPosition.searchInsert(nums, 5));
    }
}
