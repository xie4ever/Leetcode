package com.xie.leetcode.easy;

import java.math.BigInteger;

/**
 * @author xie4ever
 * @date 2018/11/29 18:48
 */
public class ReverseBits {

    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result += n & 1;
            n >>>= 1;
            if (i < 31) {
                result <<= 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ReverseBits reverseBits = new ReverseBits();
        System.out.println(reverseBits.reverseBits(1));
    }
}
