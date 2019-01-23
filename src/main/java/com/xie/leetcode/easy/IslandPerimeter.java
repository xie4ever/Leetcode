package com.xie.leetcode.easy;

/**
 * @author xie4ever
 * @date 2019/1/23 17:30
 */
public class IslandPerimeter {

    public int islandPerimeter(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    count += 4;
                    if (i != 0) {
                        if (grid[i - 1][j] == 1) {
                            count--;
                        }
                    }
                    if (j != 0) {
                        if (grid[i][j - 1] == 1) {
                            count--;
                        }
                    }
                    if (i != grid.length - 1) {
                        if (grid[i + 1][j] == 1) {
                            count--;
                        }
                    }
                    if (j != grid[i].length - 1) {
                        if (grid[i][j + 1] == 1) {
                            count--;
                        }
                    }
                }
            }
        }
        return count;
    }

    public int islandPerimeter2(int[][] grid) {
        int num = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 1) {
                    num = num + 4;
                    //如果grid[i+1][j]不超出数组并且也等于1（岛）则边减2
                    if(i + 1 < grid.length && grid[i + 1][j] == 1) {
                        num = num -2;
                    }
                    //如果grid[i][j+1]不超出数组并且也等于1（岛）则边减2
                    if(j + 1 < grid[i].length  && grid[i][j + 1] == 1) {
                        num = num -2;
                    }
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int[][] arrs = new int[][]{new int[]{0, 1, 1, 0}};
        System.out.println(new IslandPerimeter().islandPerimeter(arrs));
        System.out.println(new IslandPerimeter().islandPerimeter2(arrs));
    }
}
