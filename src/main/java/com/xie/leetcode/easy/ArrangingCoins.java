package com.xie.leetcode.easy;

/**
 * @author xie4ever
 * @date 2018/12/24 17:50
 */
public class ArrangingCoins {

    public int arrangeCoins(int n) {
        int result = 1;
        while (n > 0) {
            n = n - result;
            if (n >= 0) {
                result++;
            }
        }
        return result - 1;
    }

    public static void main(String[] args) {
        System.out.println(new ArrangingCoins().arrangeCoins(5));
    }
}
