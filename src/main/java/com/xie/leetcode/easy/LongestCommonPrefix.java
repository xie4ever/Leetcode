package com.xie.leetcode.easy;

/**
 * @author xie4ever
 * @date 2018/11/13 18:53
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < minLength) {
                minLength = strs[i].length();
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <= minLength - 1; i++) {
            String prefix = String.valueOf(strs[0].charAt(i));
            for (int j = 1; j < strs.length; j++) {
                if (!String.valueOf(strs[j].charAt(i)).equals(prefix)) {
                    return stringBuilder.toString();
                }
            }
            stringBuilder.append(prefix);
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strs = new String[]{"a", "a"};
        System.out.println(longestCommonPrefix.longestCommonPrefix(strs));
    }
}
