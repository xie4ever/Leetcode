package com.xie.leetcode.easy;

/**
 * @author xie4ever
 * @date 2018/12/13 18:34
 */
public class AddDigits {

    public int addDigits(int num) {
        return Integer.valueOf(go(String.valueOf(num)));
    }

    private String go(String s) {
        if (s.length() < 2) {
            return s;
        }
        int temp = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            temp += Integer.valueOf(String.valueOf(c));
        }
        return go(String.valueOf(temp));
    }

    public static void main(String[] args) {
        System.out.println(new AddDigits().addDigits(38));
    }
}
