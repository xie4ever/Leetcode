package com.xie.leetcode.easy;

/**
 * @author xie4ever
 * @date 2018/12/19 16:46
 */
public class GuessNumberHigherOrLower {

    public int guessNumber(int n) {
        int start = 1, end = n;
        int temp = 0;
        while (start <= end) {
            temp = start + (end - start) / 2;
            int result = guess(temp);
            if (result == 0) {
                return temp;
            } else if (result > 0) {
                start = temp + 1;
            } else {
                end = temp - 1;
            }
        }
        return temp;
    }

    private int guess(int num) {
        if (num == 6) {
            return 0;
        } else if (num < 6) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(new GuessNumberHigherOrLower().guessNumber(10));
    }
}
