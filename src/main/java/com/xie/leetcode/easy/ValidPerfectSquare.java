package com.xie.leetcode.easy;

/**
 * @author xie4ever
 * @date 2018/12/19 16:23
 */
public class ValidPerfectSquare {

    public boolean isPerfectSquare(int num) {
        long start = 0, end = num;
        while (start <= end) {
            long n = start + (end - start) / 2;
            long t = n * n;
            if (t == num) {
                return true;
            } else if (t > num) {
                end = n - 1;
            } else {
                start = n + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new ValidPerfectSquare().isPerfectSquare(2147483647));
    }
}
