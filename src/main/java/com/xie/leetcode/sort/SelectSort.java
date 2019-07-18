package com.xie.leetcode.sort;

/**
 * @author xie4ever
 * @date 2019/7/18 16:59
 */
public class SelectSort {

    private static void sort(int[] sums) {
        for (int i = 0; i < sums.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < sums.length; j++) {
                if (sums[j] < sums[i]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = sums[i];
                sums[i] = sums[minIndex];
                sums[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] sums = new int[]{3, 2, 1};
        sort(sums);
        for (int i = 0; i < sums.length; i++) {
            System.out.print(sums[i]);
        }
    }
}
