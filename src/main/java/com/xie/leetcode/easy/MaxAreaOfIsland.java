package com.xie.leetcode.easy;

/**
 * @author xie4ever
 */
public class MaxAreaOfIsland {

    public static int maxAreaOfIsland(int[][] grid) {
        int area = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    area = Math.max(area, dfs(grid, i, j));
                }
            }
        }
        return area;
    }

    public static int dfs(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length)
            return 0;

        if (grid[i][j] == 1) {
            grid[i][j] = 0;
            return 1 + dfs(grid, i, j + 1) + dfs(grid, i + 1, j) + dfs(grid, i, j - 1) + dfs(grid, i - 1, j);
        }
        return 0;
    }

    public static void main(String[] args) {
        int[][] grid1 = new int[][]{{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};

        int[][] grid2 = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

        System.out.println(maxAreaOfIsland(grid1));
        System.out.println(maxAreaOfIsland(grid2));
    }
}
