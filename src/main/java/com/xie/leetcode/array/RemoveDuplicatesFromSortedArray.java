package com.xie.leetcode.array;

/**
 * @author xie4ever
 * @date 2018/11/15 14:34
 */
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] == nums[j]) {
                continue;
            } else {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2, 2, 3, 4, 5, 5, 6};
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
        System.out.println(removeDuplicatesFromSortedArray.removeDuplicates(nums));
        for (int num :nums) {
            System.out.print(num);
        }
    }
}
