package com.xie.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xie4ever
 * @date 2018/11/19 23:27
 */
public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (numRows <= 0) {
            return result;
        }
        ArrayList<Integer> first = new ArrayList<Integer>();
        first.add(1);
        result.add(first);
        for (int i = 1; i < numRows; i++) {
            List<Integer> before = result.get(i - 1);
            List<Integer> now = new ArrayList<Integer>();
            now.add(1);
            for (int j = 1; j < i; j++) {
                now.add(before.get(j - 1) + before.get(j));
            }
            now.add(1);
            result.add(now);
        }
        return result;
    }

    public static void main(String[] args) {
        PascalsTriangle pascalsTriangle = new PascalsTriangle();
        System.out.println(pascalsTriangle.generate(3));
    }
}
