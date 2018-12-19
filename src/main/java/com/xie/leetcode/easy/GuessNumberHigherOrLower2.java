package com.xie.leetcode.easy;

/**
 * @author xie4ever
 * @date 2018/12/19 17:10
 */
public class GuessNumberHigherOrLower2 {

    public int getMoneyAmount(int n) {
        int start = 1, end = n;
        int total = 0;
        while (start <= end) {
            int temp = start + (end - start) / 2;
            if (start != end) {
                total += temp;
            }
            start = temp + 1;
        }
        return total - 1;
    }

    public static void main(String[] args) {
        System.out.println(new GuessNumberHigherOrLower2().getMoneyAmount(10));
    }
}
