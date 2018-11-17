package com.xie.leetcode.easy;

/**
 * @author xie4ever
 * @date 2018/11/17 0:02
 */
public class SqrtX {

    public int mySqrt(int x) {
        // 假装这个数就是答案，用于逐渐逼近
        double result = 1;
        // 允许误差(如果没有允许误差，可能永远逼近下去)
        double deviation = 1e-6;
        double temp;

        while (true) {
            temp = x / result;
            if (Math.abs(result - temp) <= deviation) {
                return (int)result;
            }
            // 取区间中间值，逐渐逼近
            result = (temp + result) / 2;
        }
    }

    public static void main(String[] args) {
        SqrtX sqrtX = new SqrtX();
        System.out.println(sqrtX.mySqrt(3));
    }
}
