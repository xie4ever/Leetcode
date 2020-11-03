package com.xie.leetcode.sort;

/**
 * @author xie4ever
 * @date 2020/11/3 22:36
 */
public class QuickSort2 {
    private int adjustArray(int arr[], int start, int end) {
        int pivot = arr[start];
        int left = start;
        int right = end;
        int index = start;

        while (right >= left) {
            while (right >= left) {
                if (arr[right] < pivot) {
                    arr[left] = arr[right];
                    index = right;
                    left++;
                    break;
                } else {
                    right--;
                }
            }

            while (right >= left) {
                if (arr[left] > pivot) {
                    arr[right] = arr[left];
                    index = left;
                    right--;
                    break;
                } else {
                    left++;
                }
            }
        }

        arr[index] = pivot;
        return index;
    }

    private void sort(int s[], int l, int r) {
        if (l >= r) {
            return;
        }
        int i = adjustArray(s, l, r);
        sort(s, l, i - 1);
        sort(s, i + 1, r);
    }

    public static void main(String[] args) {
        int[] sums = new int[]{3, 2, 1, 7, 8, 9, 5, 6, 4};
        QuickSort2 quickSort = new QuickSort2();
        quickSort.sort(sums, 0, sums.length - 1);
        for (int i = 0; i < sums.length; i++) {
            System.out.print(sums[i]);
        }
    }
}
