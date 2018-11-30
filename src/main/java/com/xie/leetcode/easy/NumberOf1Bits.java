package com.xie.leetcode.easy;

/**
 * @author xie4ever
 * @date 2018/11/29 19:12
 */
public class NumberOf1Bits {

    public int hammingWeight(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 31; i >= 0; i--) {
            stringBuilder.append(n >>> i & 1);
        }
        int result = 0;
        String s = stringBuilder.toString();
        for (int i = 0; i < s.length(); i++) {
            if (String.valueOf(s.charAt(i)).equals("1")) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        NumberOf1Bits numberOf1Bits = new NumberOf1Bits();
        System.out.println(numberOf1Bits.hammingWeight(1));
    }
}
