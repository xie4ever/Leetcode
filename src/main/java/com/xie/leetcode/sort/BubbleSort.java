package com.xie.leetcode.sort;

/**
 * @author xie4ever
 * @date 2019/7/19 15:37
 */
public class BubbleSort {
    private static void sort(int[] sums) {
        for (int i = 1; i < sums.length; i++) {
            for (int j = 0; j < sums.length - 1; j++) {
                if (sums[j] > sums[j + 1]) {
                    int temp = sums[j];
                    sums[j] = sums[j + 1];
                    sums[j + 1] = temp;
                }
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
