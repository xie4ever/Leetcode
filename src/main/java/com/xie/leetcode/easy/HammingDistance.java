package com.xie.leetcode.easy;

/**
 * @author xie4ever
 * @date 2019/1/22 18:01
 */
public class HammingDistance {

    public int hammingDistance(int x, int y) {
        return Integer.toBinaryString(x ^ y).replaceAll("0", "").length();
    }

    public static void main(String[] args) {
        System.out.println(new HammingDistance().hammingDistance(4, 1));
    }
}
