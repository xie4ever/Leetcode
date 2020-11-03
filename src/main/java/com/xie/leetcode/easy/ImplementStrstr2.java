package com.xie.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xie4ever
 * @date 2019/11/18 17:22
 */
public class ImplementStrstr2 {

    Map<Character, Integer> sourceIndexMap = new HashMap<>();
    Map<Character, Integer> targetIndexMap = new HashMap<>();

    public int strStr(String source, String target) {
        if (source.equals(target)) {
            return 0;
        }

        if (source.length() < target.length()) {
            return -1;
        }

        char[] sourceArr = source.toCharArray();
        for (int i = 0; i < sourceArr.length; i++) {
            char c = sourceArr[i];
            sourceIndexMap.put(c, i);
        }

        char[] targetArr = target.toCharArray();
        for (int i = 0; i < targetArr.length; i++) {
            char c = targetArr[i];
            targetIndexMap.put(c, i);
        }

        int index = -1;
        char first = targetArr[0];

        for (char sKey : sourceIndexMap.keySet()) {
            if (sKey == first) {
                int gap = sourceIndexMap.get(sKey) - targetIndexMap.get(sKey);
                for (char tKey : targetIndexMap.keySet()) {
                    // 如果在sourceIndexMap中不存在key，直接跳出循环
                    if (sourceIndexMap.get(tKey) == null) {
                        index = -1;
                        break;
                    }

                    // 间距不对，直接跳出循环
                    if (sourceIndexMap.get(tKey) - targetIndexMap.get(tKey) != gap) {
                        index = -1;
                        break;
                    }

                    index = sourceIndexMap.get(sKey);
                }
            }
        }

        return index;
    }

    public static void main(String[] args) {
        String source = "fuckyou";
        String target = "you";

        System.out.println(new ImplementStrstr2().strStr(source, target));
    }
}