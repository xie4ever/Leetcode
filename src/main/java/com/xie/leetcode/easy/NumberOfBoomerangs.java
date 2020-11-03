package com.xie.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xie4ever
 * @date 2018/12/25 19:11
 */
public class NumberOfBoomerangs {

    public int numberOfBoomerangs(int[][] points) {
        int result = 0;
        Map<Integer, Integer> map;
        for (int i = 0; i < points.length; i++) {
            map = new HashMap<Integer, Integer>();
            for (int j = 0; j < points.length; j++) {
                // 不考虑当前同样的点
                if (i != j) {
                    int distance = getDistance(points[i], points[j]);
                    map.put(distance, map.getOrDefault(distance, 0) + 1);
                }
            }
            result += getCountByPoint(map);
        }

        return result;
    }

    /**
     * 求两点之间的距离的平方, 不进行平方根操作了, 不然可能会涉及到浮点数问题
     *
     * @param pointA
     * @param pointB
     * @return
     */
    private int getDistance(int[] pointA, int[] pointB) {
        int x = pointA[0] - pointB[0];
        int y = pointA[1] - pointB[1];
        return x * x + y * y;
    }

    /**
     * 根据点的数量返回回旋镖的数量
     *
     * @return
     */
    private int getCountByPoint(Map<Integer, Integer> map) {
        int result = 0;
        for (Integer value : map.values()) {
            if (value > 1) {
                // 从n个点中选取两个点的方案数量为(n * n - 1)
                result += value * (value - 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] ints = new int[][]{new int[]{0, 0}, new int[]{1, 0}, new int[]{2, 0}};
        System.out.println(new NumberOfBoomerangs().numberOfBoomerangs(ints));
    }
}
