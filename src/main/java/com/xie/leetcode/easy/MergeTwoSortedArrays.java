package com.xie.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xie4ever
 * @date 2019/11/18 11:39
 */
public class MergeTwoSortedArrays {

    public int[] mergeSortedArray(int[] A, int[] B) {
        List<Integer> list = new ArrayList<>();

        int indexA = 0;
        int indexB = 0;

        int lengthA = A.length;
        int lengthB = B.length;

        while (indexA < lengthA || indexB < lengthB) {
            if (indexA >= lengthA && indexB < lengthB) {
                list.add(B[indexB]);
                indexB++;
            } else if (indexA < lengthA && indexB >= lengthB) {
                list.add(A[indexA]);
                indexA++;
            } else if (A[indexA] <= B[indexB]) {
                list.add(A[indexA]);
                indexA++;
            } else if (A[indexA] > B[indexB]) {
                list.add(B[indexB]);
                indexB++;
            }
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public int[] mergeSortedArray2(int[] A, int[] B) {
        int indexC = 0;


        int indexA = 0;
        int indexB = 0;

        int lengthA = A.length;
        int lengthB = B.length;
        int lengthC = lengthA + lengthB;

        int[] C = new int[lengthC];

        while (indexA < lengthA || indexB < lengthB) {
            if (indexA >= lengthA && indexB < lengthB) {
                C[indexC] = B[indexB];
                indexB++;
                indexC++;
            } else if (indexA < lengthA && indexB >= lengthB) {
                C[indexC] = A[indexA];
                indexA++;
                indexC++;
            } else if (A[indexA] <= B[indexB]) {
                C[indexC] = A[indexA];
                indexA++;
                indexC++;
            } else if (A[indexA] > B[indexB]) {
                C[indexC] = B[indexB];
                indexB++;
                indexC++;
            }
        }

        return C;
    }

    public static void main(String[] args) {
        int[] A = new int[]{1, 5};
        int[] B = new int[]{2, 3};

        int[] C = new MergeTwoSortedArrays().mergeSortedArray(A, B);
        for (int i = 0; i < C.length; i++) {
            int i1 = C[i];
            System.out.println(i1);
        }

        int[] D = new MergeTwoSortedArrays().mergeSortedArray2(A, B);
        for (int i = 0; i < D.length; i++) {
            int i1 = D[i];
            System.out.println(i1);
        }
    }
}
