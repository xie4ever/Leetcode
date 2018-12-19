package com.xie.leetcode.easy;

/**
 * @author xie4ever
 * @date 2018/12/18 19:01
 */
public class ReverseString {

    public String reverseString(String s) {
        if (s.length() == 0) {
            return "";
        }
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            stringBuilder = stringBuilder.append(String.valueOf(chars[i]));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(new ReverseString().reverseString("A man, a plan, a canal: Panama"));
    }
}
