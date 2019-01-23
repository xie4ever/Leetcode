package com.xie.leetcode.easy;

import java.util.Arrays;

/**
 * @author xie4ever
 * @date 2018/12/27 18:05
 */
public class AssignCookies {

    public int findContentChildren(int[] g, int[] s) {
        if (g.length == 0 || s.length == 0) {
            return 0;
        }
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        while (i < g.length) {
            if (j > s.length - 1) {
                break;
            }
            if (s[j] >= g[i]) {
                i++;
                j++;
            } else {
                // g[i] = g[i] - s[j];
                j++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(new AssignCookies().findContentChildren(new int[]{1, 4, 10}, new int[]{1, 1, 1, 1, 0}));
    }
}
