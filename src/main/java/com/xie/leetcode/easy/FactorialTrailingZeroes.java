package com.xie.leetcode.easy;

/**
 * @author xie4ever
 * @date 2018/11/28 16:44
 */
public class FactorialTrailingZeroes {

    public int trailingZeroes(int n) {
        int sum = 0;
        while (n > 0) {
            n /= 5;
            sum += n;
        }
        return sum;
    }

    public static void main(String[] args) {
        FactorialTrailingZeroes factorialTrailingZeroes = new FactorialTrailingZeroes();
        System.out.println(factorialTrailingZeroes.trailingZeroes(3));
    }
}
