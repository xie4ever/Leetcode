package com.xie.leetcode.easy;

/**
 * @author xie4ever
 * @date 2018/12/17 18:50
 */
public class NimGame {

    public boolean canWinNim(int n) {
        if (3 >= n || n == 5) {
            return true;
        }
        if (n % 4 == 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new NimGame().canWinNim(4));
    }
}
