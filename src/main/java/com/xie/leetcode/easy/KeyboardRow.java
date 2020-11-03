package com.xie.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xie4ever
 * @date 2019/7/25 17:19
 */
public class KeyboardRow {

    public String[] findWords(String[] words) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('q', 1);
        map.put('w', 1);
        map.put('e', 1);
        map.put('r', 1);
        map.put('t', 1);
        map.put('y', 1);
        map.put('u', 1);
        map.put('i', 1);
        map.put('o', 1);
        map.put('p', 1);
        map.put('a', 2);
        map.put('s', 2);
        map.put('d', 2);
        map.put('f', 2);
        map.put('g', 2);
        map.put('h', 2);
        map.put('j', 2);
        map.put('k', 2);
        map.put('l', 2);
        map.put('z', 3);
        map.put('x', 3);
        map.put('c', 3);
        map.put('v', 3);
        map.put('b', 3);
        map.put('n', 3);
        map.put('m', 3);

        List<String> list = new ArrayList<String>();

        for (int i = 0; i < words.length; i++) {
            String temp = words[i].toLowerCase();
            for (int k = 0; k < words[i].length(); k++) {
                if (map.get(temp.charAt(k)) != map.get(temp.charAt(0))) {
                    break;
                } else {
                    if (k == words[i].length() - 1) {
                        list.add(words[i]);
                    }
                }
            }
        }

        String[] result = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        String[] strings = new String[]{"Hello", "Alaska", "Dad", "Peace"};
        String[] result = new KeyboardRow().findWords(strings);

        for (int i = 0; i < result.length - 1; i++) {
            System.out.println(result[i]);
        }
    }
}
