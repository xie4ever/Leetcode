package com.xie.leetcode.easy;

import java.util.Arrays;

/**
 * @author xie4ever
 * @date 2018/12/17 17:44
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        if (nums.length == 0) {
            return;
        }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                continue;
            } else {
                for (int j = i; j > index; j--) {
                    int beforeIndex = j - 1;
                    if (beforeIndex < 0) {
                        break;
                    }
                    int beforeValue = nums[beforeIndex];
                    if (beforeValue == 0) {
                        int temp = nums[j];
                        nums[beforeIndex] = temp;
                        nums[j] = 0;
                    } else {
                        break;
                    }
                }
            }
            index++;
        }
    }

    public static void main(String[] args) {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] fuck = new int[]{0, 1, 2, 0, 1};
        moveZeroes.moveZeroes(fuck);
        System.out.println(Arrays.toString(fuck));
    }
}
