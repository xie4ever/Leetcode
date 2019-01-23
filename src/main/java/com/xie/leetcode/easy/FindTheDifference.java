package com.xie.leetcode.easy;

import java.util.HashMap;

/**
 * @author xie4ever
 * @date 2018/12/20 15:52
 */
public class FindTheDifference {

    public char findTheDifference(String s, String t) {
        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();
        if (s == "") {
            return chars1[0];
        }
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i], map.getOrDefault(chars[i], 0) + 1);
        }

        HashMap<Character,Integer> map1 = new HashMap<Character, Integer>();
        for (int i = 0; i < chars1.length; i++) {
            map1.put(chars1[i], map1.getOrDefault(chars1[i], 0) + 1);
        }

        for (char key : map1.keySet()) {
            if (map.get(key) == null) {
                return key;
            }
            int num = map1.get(key);
            int num1 = map.get(key);
            if (num != num1) {
                return key;
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        System.out.println(new FindTheDifference().findTheDifference("abcd", "abcde"));
    }
}
