package com.xie.leetcode.easy;

/**
 * @author xie4ever
 * @date 2018/12/27 18:25
 */
public class PoorPigs {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int k = minutesToTest / minutesToDie + 1;
        for (int i = 0, max = 1;; i++, max *= k) {
            if (max >= buckets) {
                return i;
            }
        }
    }
}
