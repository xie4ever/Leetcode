package com.xie.leetcode.easy;

import java.util.Arrays;

/**
 * @author xie4ever
 * @date 2018/11/17 13:19
 */
public class MergeSortedArray2 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public void moveBack(int[] nums1, int index) {
        int length = nums1.length;
        for (int i = length - 1; i > index; i--) {
            nums1[i] = nums1[i - 1];
        }
        nums1[index] = 0;
    }

    public static void main(String[] args) {

        int[] A = new int[]{-1,0,0,3,3,3,0,0,0};
        int[] B = new int[]{1,2,2};

        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));

        MergeSortedArray2 mergeSortedArray2 = new MergeSortedArray2();
        mergeSortedArray2.merge(A, 6, B, 3);

        System.out.println(Arrays.toString(A));
    }
}
