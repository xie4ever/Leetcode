package com.xie.leetcode.easy;

/**
 * @author xie4ever
 * @date 2018/12/14 18:13
 */
public class FirstBadVersion {

    public int firstBadVersion(int n) {
        int high = n;
        int low = 1;
        while (low < high) {
            int middle = low + (high - low) / 2;
            boolean flag = isBadVersion(middle);
            if (flag) {
                high = middle;
            } else {
                low = middle + 1;
            }
        }
        return low;
    }

    private boolean isBadVersion(int version) {
        if (version <= 2) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new FirstBadVersion().firstBadVersion(5));
    }
}
