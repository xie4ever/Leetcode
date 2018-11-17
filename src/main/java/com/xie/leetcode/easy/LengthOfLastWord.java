package com.xie.leetcode.easy;

/**
 * @author xie4ever
 * @date 2018/11/16 18:32
 */
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        if (s.trim().equals("")) {
            return 0;
        }

        String temp = s;
        // 处理字符串后所有空格
        int length = temp.length();
        while (String.valueOf(temp.charAt(length - 1)).equals(" ")) {
            temp = temp.substring(0, length - 1);
            length--;
        }

        int result = 0;
        for (int i = temp.length() - 1; i >= 0; i--) {
            if (!String.valueOf(temp.charAt(i)).equals(" ")) {
                result++;
            } else {
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        System.out.println(lengthOfLastWord.lengthOfLastWord(" "));
    }
}
