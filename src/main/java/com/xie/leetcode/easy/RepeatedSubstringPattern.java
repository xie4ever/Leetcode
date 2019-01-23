package com.xie.leetcode.easy;

/**
 * @author xie4ever
 * @date 2018/12/27 18:27
 */
public class RepeatedSubstringPattern {

    public boolean repeatedSubstringPattern(String s) {
        int min = 1;
        while (min <= s.length() / 2) {
            if (s.length() % min != 0) {
                min++;
                continue;
            }
            String temp = s.substring(0, min);
            for (int i = min; i < s.length(); i = i + min) {
                if ((i + min == s.length()) && s.substring(i, i + min).equals(temp)) {
                    return true;
                }
                if (!s.substring(i, i + min).equals(temp)) {
                    min++;
                    break;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new RepeatedSubstringPattern().repeatedSubstringPattern("abcabcd"));
    }
}
