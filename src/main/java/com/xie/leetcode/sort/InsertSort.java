package com.xie.leetcode.sort;

/**
 * @author xie4ever
 * @date 2019/7/22 16:10
 */
public class InsertSort {

    private static void sort(int[] sums) {
        for (int i = 1; i < sums.length; i++) {
            int value = sums[i];

            int j = i;
            while (j > 0 && value < sums[j - 1]) {
                sums[j] = sums[j - 1];
                j--;
            }

            if (j != i) {
                sums[j] = value;
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
