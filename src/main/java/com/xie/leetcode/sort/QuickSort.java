package com.xie.leetcode.sort;

/**
 * @author xie4ever
 * @date 2020/11/3 21:17
 */
public class QuickSort {

    private int adjustArray(int s[], int l, int r) { //返回调整后基准数的位置
        int i = l, j = r;
        int x = s[l]; // s[l]即s[i]就是第一个坑
        while (i < j) {
            // 从右向左找小于x的数来填s[i]
            while (i < j && s[j] >= x) {
                j--;
            }
            if (i < j) {
                s[i] = s[j]; // 将s[j]填到s[i]中，s[j]就形成了一个新的坑
                i++;
            }

            // 从左向右找大于或等于x的数来填s[j]
            while (i < j && s[i] < x) {
                i++;
            }
            if (i < j) {
                s[j] = s[i]; // 将s[i]填到s[j]中，s[i]就形成了一个新的坑
                j--;
            }
        }
        // 退出时，i等于j。将x填到这个坑中。
        s[i] = x;

        return i;
    }

    private void sort(int s[], int l, int r) {
        if (l < r) {
            int i = adjustArray(s, l, r);//先成挖坑填数法调整s[]
            sort(s, l, i - 1); // 递归调用
            sort(s, i + 1, r);
        }
    }

    public static void main(String[] args) {
        int[] sums = new int[]{3, 2, 1, 7, 8, 9, 5, 6, 4};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(sums, 0, sums.length - 1);
        for (int i = 0; i < sums.length; i++) {
            System.out.print(sums[i]);
        }
    }
}
