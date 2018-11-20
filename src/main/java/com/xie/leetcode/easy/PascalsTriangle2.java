package com.xie.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xie4ever
 * @date 2018/11/20 18:08
 */
public class PascalsTriangle2 {

    public List<Integer> getRow(int rowIndex) {
        rowIndex = rowIndex + 1;
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (rowIndex < 0) {
            return new ArrayList<Integer>();
        }
        List<Integer> first = new ArrayList<Integer>();
        first.add(1);
        result.add(first);
        for (int i = 1; i < rowIndex; i++) {
            List<Integer> before = result.get(i - 1);
            List<Integer> now = new ArrayList<Integer>();
            now.add(1);
            for (int j = 1; j < i; j++) {
                now.add(before.get(j - 1) + before.get(j));
            }
            now.add(1);
            result.add(now);
        }
        return result.get(rowIndex - 1);
    }

    public static void main(String[] args) {
        PascalsTriangle2 pascalsTriangle2 = new PascalsTriangle2();
        System.out.println(pascalsTriangle2.getRow(3));
    }
}
