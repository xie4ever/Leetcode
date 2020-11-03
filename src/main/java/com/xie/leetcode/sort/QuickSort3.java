package com.xie.leetcode.sort;

/**
 * @author xie4ever
 * @date 2020/11/3 22:50
 */
public class QuickSort3 {
    private int adjustArray(int arr[], int start, int end) {
        int pivot = arr[start];
        int left = start;
        int right = end;

        while (left != right) {
            // 控制right指针比较并左移
            while (left < right && arr[right] > pivot) {
                right--;
            }

            // 控制right指针比较并右移
            while (left < right && arr[left] <= pivot) {
                left++;
            }

            // 交换left和right指向的元素
            if (left < right) {
                int p = arr[left];
                arr[left] = arr[right];
                arr[right] = p;
            }

            // pivot和指针重合点交换
            int p = arr[left];
            arr[left] = arr[start];
            arr[start] = p;
            return left;
        }

        return left;
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
        QuickSort3 quickSort = new QuickSort3();
        quickSort.sort(sums, 0, sums.length - 1);
        for (int i = 0; i < sums.length; i++) {
            System.out.print(sums[i]);
        }
    }
}
