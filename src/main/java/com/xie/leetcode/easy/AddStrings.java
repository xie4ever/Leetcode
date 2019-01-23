package com.xie.leetcode.easy;

/**
 * @author xie4ever
 * @date 2018/12/21 11:26
 */
public class AddStrings {

    public String addStrings(String num1, String num2) {
        StringBuilder sb1 = new StringBuilder(num1).reverse();
        StringBuilder sb2 = new StringBuilder(num2).reverse();

        int max = 0;
        int length1 = num1.length();
        int length2 = num2.length();
        if (length1 >= length2) {
            max = length1;
            for (int i = 0; i < length1 - length2; i++) {
                sb2.append("0");
            }
        } else {
            max = length2;
            for (int i = 0; i < length2 - length1; i++) {
                sb1.append("0");
            }
        }

        char[] chars1 = sb1.toString().toCharArray();
        char[] chars2 = sb2.toString().toCharArray();

        StringBuilder stringBuilder = new StringBuilder();
        boolean flag = false;
        for (int i = 0; i < max; i++) {
            int n1 = Integer.valueOf(String.valueOf(chars1[i]));
            int n2 = Integer.valueOf(String.valueOf(chars2[i]));
            int result = 0;
            if (flag) {
                if (n1 + n2 + 1 >= 10) {
                    result = n1 + n2 + 1 - 10;
                    flag = true;
                } else {
                    result = n1 + n2 + 1;
                    flag = false;
                }
            } else {
                if (n1 + n2 >= 10) {
                    result = n1 + n2 - 10;
                    flag = true;
                } else {
                    result = n1 + n2;
                    flag = false;
                }
            }
            stringBuilder.append(result);
        }
        if (flag) {
            stringBuilder.append(1);
        }
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new AddStrings().addStrings("408", "5"));
    }
}
