package com.xie.leetcode.array;

/**
 * @author xie4ever
 * @date 2018/11/12 23:48
 */
public class ReverseInteger2 {
    public int reverse(int x) {
        int rev = 0;
        int INT_MAX = Integer.MAX_VALUE;
        int INT_MIN = Integer.MIN_VALUE;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > INT_MAX/10 || (rev == INT_MAX / 10 && pop > 7)) return 0;
            if (rev < INT_MIN/10 || (rev == INT_MIN / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public static void main(String[] args) {
        ReverseInteger2 reverseInteger = new ReverseInteger2();
        System.out.println(reverseInteger.reverse(-10203000));
    }
}
