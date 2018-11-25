package com.xie.leetcode.easy;

/**
 * @author xie4ever
 * @date 2018/11/24 18:17
 */
public class TwoSumIIInputArrayIsSorted2 {

    public int[] twoSum(int[] numbers, int target) {
        if (numbers.length == 0) {
            return null;
        }
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            if (numbers[right] + numbers[left] > target) {
                right--;
            } else if (numbers[right] + numbers[left] < target) {
                left++;
            } else {
                return new int[]{left + 1, right + 1};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{2, 7, 11, 15};
        TwoSumIIInputArrayIsSorted2 twoSumIIInputArrayIsSorted = new TwoSumIIInputArrayIsSorted2();
        int[] result = twoSumIIInputArrayIsSorted.twoSum(numbers, 9);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
