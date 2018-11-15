package com.xie.leetcode.easy;

import java.util.Stack;

/**
 * @author xie4ever
 * @date 2018/11/12 18:41
 */
public class ReverseInteger {
    public int reverse(int x) {
        try {
            long maxVal = 1;
            maxVal = maxVal << 31;
            if (x >= maxVal || x < (-1 * maxVal)) {
                return 0;
            }

            String tempString = String.valueOf(x);
            StringBuilder stringBuilder = new StringBuilder();
            int s = 0;
            if (String.valueOf(tempString.charAt(0)).equals("-")) {
                stringBuilder.append(tempString.charAt(0));
                s = 1;
            }
            Stack<String> stack = new Stack<String>();
            for (int i = s; i < tempString.length(); i++) {
                stack.push(String.valueOf(tempString.charAt(i)));
            }
            boolean flag = false;
            while (!stack.empty()) {
                if (!flag && stack.lastElement().equals("0")) {
                    stack.pop();
                    continue;
                }
                flag = true;
                stringBuilder.append(stack.pop());
            }
            return Integer.valueOf(stringBuilder.toString());
        } catch (Exception e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println(reverseInteger.reverse(-2145500));
    }
}
