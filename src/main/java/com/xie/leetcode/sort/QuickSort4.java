package com.xie.leetcode.sort;

/**
 * @author xie4ever
 * @date 2020/11/5 21:41
 */
public class QuickSort4 {

    private void sort(int[] arrs, int start, int end) {
        if (start > end) {
            return;
        }
        int i = adjust(arrs, start, end);
        sort(arrs, start, i - 1);
        sort(arrs, i + 1, end);
    }

    private int adjust(int[] arrs, int start, int end) {
        int index = start;
        int left = start;
        int right = end;
        int value = arrs[index];

        while (left <= right) {
            while (left <= right) {
                if (right < value) {
                    arrs[left] = arrs[right];
                    index = right;
                    left++;
                    break;
                } else {
                    right--;
                }
            }

            while (left <= right) {
                if (left > value) {
                    arrs[right] = arrs[left];
                    index = left;
                    right--;
                    break;
                } else {
                    left++;
                }
            }
        }

        arrs[index] = value;
        return index;
    }

    public static void main(String[] args) {
        int[] sums = new int[]{3, 2, 1, 7, 8, 9, 5, 6, 4};
        QuickSort4 quickSort = new QuickSort4();
        quickSort.sort(sums, 0, sums.length - 1);
        for (int i = 0; i < sums.length; i++) {
            System.out.print(sums[i]);
        }
    }
}
