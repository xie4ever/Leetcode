package com.xie.leetcode.easy;

/**
 * @author xie4ever
 * @date 2018/12/22 10:37
 */
public class NumberOfSegmentsInAString {

    public int countSegments(String s) {
        /*
         ** 单词结束的标志是遇到空白字符,设置flag = 0
         ** 单词开始的标记是第一次遇到非空白字符设置flag = 1
         */
        int sum = 0;
        int flag = 0;

        for(int i = 0; i < s.length(); ++i){
            char ch = s.charAt(i);
            if(ch == ' ')
                flag = 0;
            if(ch != ' ' && flag == 0)
            {
                sum++;
                flag = 1;
            }

        }
        return sum;
    }
}
