package com.xie.leetcode.easy;

/**
 * @author xie4ever
 * @date 2018/11/15 23:47
 */
public class PlusOneBadExample {
    public int[] plusOne(int[] digits) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int digit : digits) {
            stringBuilder.append(String.valueOf(digit));
        }
        long tempLong = Long.valueOf(stringBuilder.toString()) + 1;
        String tempString = String.valueOf(tempLong);
        int[] arr = new int[tempString.length()];
        for (int i = 0; i < tempString.length(); i++) {
            arr[i] = Integer.valueOf(String.valueOf(tempString.charAt(i)));
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] digits = new int[]{9,8,7,6,5,4,3,2,1,0};
        PlusOneBadExample plusOneBadExample = new PlusOneBadExample();
        for (int i : plusOneBadExample.plusOne(digits)) {
            System.out.print(i);
        }
    }
}
