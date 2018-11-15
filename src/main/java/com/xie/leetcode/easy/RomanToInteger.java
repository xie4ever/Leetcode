package com.xie.leetcode.easy;

import java.util.HashMap;

/**
 * @author xie4ever
 * @date 2018/11/13 18:34
 */
public class RomanToInteger {

    public int romanToInt(String s) {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("I", 1);
        hashMap.put("V", 5);
        hashMap.put("X", 10);
        hashMap.put("L", 50);
        hashMap.put("C", 100);
        hashMap.put("D", 500);
        hashMap.put("M", 1000);

        int result = 0;
        if (s.length() == 1) {
            return hashMap.get(s);
        }

        for (int i = 0; i < s.length(); i++) {
            int a = hashMap.get(String.valueOf(s.charAt(i)));
            if (i == s.length() - 1) {
                result = result + a;
                return result;
            }

            int b = hashMap.get(String.valueOf(s.charAt(i + 1)));
            if (a >= b) {
                result = result + a;
            } else {
                result = result - a;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.romanToInt("VV"));
    }
}
