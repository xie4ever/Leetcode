package com.xie.leetcode.sort;

/**
 * @author xie4ever
 * @date 2019/7/23 14:33
 */
public class ShellsSort {

    private static void sort(int[] sums) {
        int gap = 1;
        while (gap < sums.length) {
            gap = gap * 3 + 1;
        }

        while (gap > 0) {
            for (int i = gap; i < sums.length; i++) {
                int tmp = sums[i];
                int j = i - gap;
                while (j >= 0 && sums[j] > tmp) {
                    sums[j + gap] = sums[j];
                    j -= gap;
                }
                sums[j + gap] = tmp;
            }
            gap = (int) Math.floor(gap / 3);
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
