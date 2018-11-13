package com.xie.leetcode.array;

import java.util.Stack;

/**
 * @author xie4ever
 * @date 2018/11/13 19:25
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        int length = s.length();
        if (length % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<Character>();
        char[] charArr = s.toCharArray();
        for (char c : charArr) {
            if (stack.size() == 0) {
                stack.push(c);
            } else if (equal(stack.peek(), c)) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.size() == 0;
    }

    public boolean equal(char a, char b) {
        return (a == '(' && b == ')') || (a == '[' && b == ']') || (a == '{' && b == '}');
    }

    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid("()"));
    }
}
