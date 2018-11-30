package com.xie.leetcode.easy;

/**
 * @author xie4ever
 * @date 2018/11/30 18:23
 */
public class HappyNumber {

    int[] unhappy = new int[]{4, 16, 37, 58, 89, 145, 42, 20};

    public boolean isHappy(int n) {
        for (int i = 0; i < unhappy.length; i++) {
            if (n == unhappy[i]) {
                return false;
            }
        }
        String temp = String.valueOf(n);
        int result = 0;
        char[] chars = temp.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int t = Integer.parseInt(String.valueOf(chars[i]));
            result = result + t * t;
        }
        if (result == 1) {
            return true;
        }
        return isHappy(result);
    }

    public static void main(String[] args) {
        HappyNumber happyNumber = new HappyNumber();
        System.out.println(happyNumber.isHappy(7));
    }
}
