package com.xie.leetcode.easy;

/**
 * @author xie4ever
 * @date 2018/11/20 19:22
 */
public class ValidatePalindrome {

    public boolean isPalindrome(String s) {
        if (s.equals("")) {
            return true;
        }
        int start = 0;
        int end = s.length() - 1;
        s = s.toUpperCase();
        while (start < end && start < s.length() - 1) {
            if (!filter(s.charAt(start))) {
                start++;
                continue;
            } else if (!filter(s.charAt(end))) {
                end--;
                continue;
            } else {
                if (s.charAt(start) != s.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }

    private boolean filter(char c) {
        return ((c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'));
    }

    public static void main(String[] args) {
        ValidatePalindrome validatePalindrome = new ValidatePalindrome();
        System.out.println(validatePalindrome.isPalindrome("ab"));
    }
}


