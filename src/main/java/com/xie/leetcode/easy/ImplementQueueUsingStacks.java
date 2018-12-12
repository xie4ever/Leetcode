package com.xie.leetcode.easy;

import java.util.Stack;

/**
 * @author xie4ever
 * @date 2018/12/11 18:36
 */
public class ImplementQueueUsingStacks {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    /** Initialize your data structure here. */
    public ImplementQueueUsingStacks() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        int pop = stack2.pop();
        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
        return pop;
    }

    /** Get the front element. */
    public int peek() {
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        int pop = stack2.peek();
        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
        return pop;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.empty();
    }
}
