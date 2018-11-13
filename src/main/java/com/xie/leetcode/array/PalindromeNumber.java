package com.xie.leetcode.array;

/**
 * @author xie4ever
 * @date 2018/11/13 18:24
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String temp = String.valueOf(x);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = temp.length() - 1; i >= 0; i--) {
            stringBuilder.append(temp.charAt(i));
        }
        return temp.equals(stringBuilder.toString());
    }

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        palindromeNumber.isPalindrome(121);
    }
}
