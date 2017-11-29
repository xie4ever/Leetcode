package com.xie.leetcode.array;

import java.util.Arrays;

/**
 * 
 * @author xie4ever
 *
 */

public class mergeSortedArrayDay1 {

	public static void merge(int A[], int m, int B[], int n) {

		int i = m - 1;
		int j = n - 1;
		int k = m + n - 1;

		while (i >= 0 && j >= 0) {

			if (A[i] > B[j]) {

				A[k--] = A[i--];

			} else {

				A[k--] = B[j--];
			}
		}

		while (j >= 0) {

			A[k--] = B[j--];
		}
	}

	public static void main(String[] args) {

		int A[] = new int[6];

		A[0] = 1;
		A[1] = 2;
		A[2] = 3;

		int B[] = new int[] { 2, 3, 6 };

		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(B));

		merge(A, 3, B, 3);

		System.out.println(Arrays.toString(A));
	}
}
