package com.xie.leetcode.easy;

/**
 * @author xie4ever
 * @date 2018/11/15 18:52
 */
public class ImplementStrStr {

    public int strStr(String haystack, String needle) {
        if (needle.equals(""))
            return 0;
        int hL = haystack.length();
        int nL = needle.length();
        if (nL > hL)
            return -1;
        if (hL == nL) {
            if (haystack.equals(needle)) {
                return 0;
            }
            return -1;
        }

        char[] h = haystack.toCharArray();
        char[] n = needle.toCharArray();
        for (int i = 0; i < h.length; i++) {
            if (h[i] == n[0]) {
                int index = i;
                for (int j = 0; j < n.length; j++) {
                    if (index > h.length - 1) {
                        break;
                    }
                    if (n[j] == h[index]) {
                        index++;
                    } else {
                        break;
                    }
                    if (j == n.length - 1) {
                        return i;
                    }
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        ImplementStrStr implementStrStr = new ImplementStrStr();
        System.out.println(implementStrStr.strStr("hello", "ll"));
    }
}
