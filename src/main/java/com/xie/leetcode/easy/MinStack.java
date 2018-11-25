package com.xie.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xie4ever
 * @date 2018/11/23 18:39
 */
public class MinStack {

    private int lastIndex;
    private int minStack;
    private List<Integer> list;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        lastIndex = 0;
        minStack = Integer.MAX_VALUE;
        list = new ArrayList<Integer>();
    }

    public void push(int x) {
        lastIndex++;
        if (x < minStack) {
            minStack = x;
        }
        list.add(x);
    }

    public void pop() {
        if (lastIndex == 0) {
            return;
        }
        lastIndex--;
        list.remove(lastIndex);
        if (lastIndex == -1) {
            minStack = 0;
        } else {
            int newmin = Integer.MAX_VALUE;
            for (Integer i : list) {
                if (i < newmin) {
                    newmin = i;
                }
            }
            minStack = newmin;
        }
    }

    public int top() {
        if (lastIndex == 0) {
            return 0;
        }
        return list.get(lastIndex - 1);
    }

    public int getMin() {
        if (lastIndex == 0) {
            return 0;
        }
        return minStack;
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        System.out.println(minStack.getMin());
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }
}
