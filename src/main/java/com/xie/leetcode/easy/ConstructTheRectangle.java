package com.xie.leetcode.easy;

/**
 * @author xie4ever
 * @date 2019/7/27 14:43
 */
public class ConstructTheRectangle {

    public int[] constructRectangle(int area) {
        int w = (int) Math.sqrt(area);
        while (area % w != 0) {
            w--;
        }

        return new int[]{area / w, w};
    }

    public static void main(String[] args) {
        int[] sums = new ConstructTheRectangle().constructRectangle(4);
        for (int i = 0; i < sums.length; i++) {
            System.out.println(sums[i]);
        }
    }
}
