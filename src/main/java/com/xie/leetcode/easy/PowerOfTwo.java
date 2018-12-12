package com.xie.leetcode.easy;

/**
 * @author xie4ever
 * @date 2018/12/11 18:27
 */
public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        if ((n & (n-1)) == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        PowerOfTwo powerOfTwo = new PowerOfTwo();
        System.out.println(powerOfTwo.isPowerOfTwo(16));
    }
}
