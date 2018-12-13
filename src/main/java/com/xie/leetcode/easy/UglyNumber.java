package com.xie.leetcode.easy;

/**
 * @author xie4ever
 * @date 2018/12/13 18:54
 */
public class UglyNumber {

    public boolean isUgly(int num) {
        if (num <= 0)
            return false;
        while (num % 2 == 0)
            num /= 2;
        while (num % 3 == 0)
            num /= 3;
        while (num % 5 == 0)
            num /= 5;
        return num == 1;
    }
}
