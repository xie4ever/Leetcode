package com.xie.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xie4ever
 * @date 2018/12/19 17:54
 */
public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote == "") {
            return true;
        }
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] chars = magazine.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!map.containsKey(chars[i])) {
                map.put(chars[i], 1);
            } else {
                int num = map.get(chars[i]);
                map.put(chars[i], num + 1);
            }
        }

        char[] chars2 = ransomNote.toCharArray();
        for (int i = 0; i < chars2.length; i++) {
            if (!map.containsKey(chars2[i])) {
                return false;
            }
            int num = map.get(chars2[i]);
            if (num <= 0) {
                return false;
            }

            map.put(chars2[i], num - 1);
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(new RansomNote().canConstruct("dehifb", "hhjdgjbhahaagihhhhhajjibjffhijehda"));
    }
}
