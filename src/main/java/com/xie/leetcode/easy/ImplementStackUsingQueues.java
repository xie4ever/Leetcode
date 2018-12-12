package com.xie.leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author xie4ever
 * @date 2018/12/10 18:08
 */
public class ImplementStackUsingQueues {

    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    /**
     * Initialize your data structure here.
     */
    public ImplementStackUsingQueues() {
        queue1 = new LinkedList<Integer>();
        queue2 = new LinkedList<Integer>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        while (!queue1.isEmpty()) {
            queue2.add(queue1.poll());
        }
        queue1.add(x);
        while (!queue2.isEmpty()) {
            queue1.add(queue2.poll());
        }
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        return queue1.poll();
    }

    /**
     * Get the top element.
     */
    public int top() {
        return queue1.peek();
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return queue1.isEmpty();
    }

    public static void main(String[] args) {
        ImplementStackUsingQueues implementStackUsingQueues = new ImplementStackUsingQueues();
        implementStackUsingQueues.push(1);
        implementStackUsingQueues.push(2);
        System.out.println(implementStackUsingQueues.top());
        System.out.println(implementStackUsingQueues.pop());
        System.out.println(implementStackUsingQueues.empty());
    }
}
