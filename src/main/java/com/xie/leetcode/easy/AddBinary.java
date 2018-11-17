package com.xie.leetcode.easy;

/**
 * @author xie4ever
 * @date 2018/11/16 19:10
 */
public class AddBinary {

    public String addBinary(String a, String b) {
        int lengthA = a.length();
        int lengthB = b.length();
        if (lengthA >= lengthB) {
            String prefix = "";
            for (int i = 0; i < lengthA - lengthB; i++) {
                prefix = prefix + "0";
            }
            b = prefix + b;
        } else {
            String prefix = "";
            for (int i = 0; i < lengthB - lengthA; i++) {
                prefix = prefix + "0";
            }
            a = prefix + a;
        }

        StringBuilder stringBuilder = new StringBuilder();
        char[] ca = a.toCharArray();
        char[] cb = b.toCharArray();
        int flag = 0;
        for (int i = ca.length - 1; i >= 0; i--) {
            int ta = Integer.valueOf(String.valueOf(ca[i]));
            int tb = Integer.valueOf(String.valueOf(cb[i]));
            int result = ta + tb + flag;
            if (result == 0) {
                stringBuilder.append("0");
                flag = 0;
            } else if (result == 1) {
                stringBuilder.append("1");
                flag = 0;
            } else if (result == 2) {
                stringBuilder.append("0");
                flag = 1;
            } else {
                stringBuilder.append("1");
                flag = 1;
            }
        }
        if (flag == 1) {
            stringBuilder.append("1");
        }

        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        AddBinary addBinary = new AddBinary();
        System.out.println(addBinary.addBinary("110", "10"));
    }
}
