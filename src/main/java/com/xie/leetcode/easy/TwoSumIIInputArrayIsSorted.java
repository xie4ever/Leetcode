package com.xie.leetcode.easy;

/**
 * @author xie4ever
 * @date 2018/11/24 18:17
 */
public class TwoSumIIInputArrayIsSorted {

    public int[] twoSum(int[] numbers, int target) {
        if (numbers.length == 0) {
            return null;
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j && target - numbers[i] == numbers[j]) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{2, 7, 11, 15};
        TwoSumIIInputArrayIsSorted twoSumIIInputArrayIsSorted = new TwoSumIIInputArrayIsSorted();
        int[] result = twoSumIIInputArrayIsSorted.twoSum(numbers, 9);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
