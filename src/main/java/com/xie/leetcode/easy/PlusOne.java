package com.xie.leetcode.easy;

/**
 * @author xie4ever
 * @date 2018/11/16 0:16
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        int length = digits.length - 1;
        return go(digits, length);
    }

    public int[] go(int[] digits , int index) {
        if (index < 0) {
            int[] arr = new int[digits.length + 1];
            arr[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                arr[i + 1] = digits[i];
            }
            return arr;
        }
        if (digits[index] != 9) {
            digits[index] = digits[index] + 1;
        } else {
            digits[index] = 0;
            digits = go(digits, index - 1);
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] digits = new int[]{9};
        PlusOne plusOne = new PlusOne();
        for (int i : plusOne.plusOne(digits)) {
            System.out.print(i);
        }
    }
}
