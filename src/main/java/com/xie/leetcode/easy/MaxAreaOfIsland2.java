package com.xie.leetcode.easy;

/**
 * @author xie4ever
 */
public class MaxAreaOfIsland2 {

	public static int maxAreaOfIsland(int[][] grid) {
		int area = 0;
		int temp = 0;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1) {
					temp = findNeighbor(grid, j, i);
					area = Math.max(area, temp);
				}
			}
		}
		return area;
	}

	public static int findNeighbor(int[][] map, int x, int y) {
		int sum = 1;

		if (map[y][x] == 0) {
			return 0; // 找不到就不加
		} else {
			map[y][x] = 0; // 历史记录置为0，否则会死循环
		}

		if (y <= map.length - 2)
			sum += findNeighbor(map, x, y + 1); // 上下左右四方遍历，注意不能用else if

		if (x <= map[0].length - 2)
			sum += findNeighbor(map, x + 1, y);

		if (x >= 1)
			sum += findNeighbor(map, x - 1, y);

		if (y >= 1)
			sum += findNeighbor(map, x, y - 1);

		return sum;
	}

	public static void main(String[] args) {
		int[][] grid1 = new int[][] { { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
				                      { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 }, 
				                      { 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
				                      { 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0 },
				                      { 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0 },
				                      { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 }, 
				                      { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
				                      { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 } };

		int[][] grid2 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };

		System.out.println(maxAreaOfIsland(grid1));
		System.out.println(maxAreaOfIsland(grid2));
	}
}
