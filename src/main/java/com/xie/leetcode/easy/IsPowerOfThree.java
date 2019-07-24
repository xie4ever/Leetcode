package com.xie.leetcode.easy;

/**
 * @author xie4ever
 * @date 2019/7/24 11:42
 */
public class IsPowerOfThree {

    public boolean isPowerOfThree(int n) {
        if (n == 1 || n == 3) {
            return true;
        }

        if (n == 0 || n % 3 != 0) {
            return false;
        }

        return isPowerOfThree(n / 3);
    }

    public static void main(String[] args) {
        System.out.println(new IsPowerOfThree().isPowerOfThree(45));
    }
}
