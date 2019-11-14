package com.xie.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author xie4ever
 * @date 2019/10/23 16:09
 */
public class test1 {
    public static int[][] transpose(int[][] A) {
        int row = A.length, col = A[0].length;
        int[][] result = new int[col][row];
        for (int m = 0; m < row; ++m)
            for (int n = 0; n < col; ++n) {
                result[n][m] = A[m][n];
            }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> l = new ArrayList<>();
        while (sc.hasNext()) {
            l.add(sc.nextInt());
        }

        int length = l.size();

        double size = Math.sqrt(Double.valueOf(length));
        int sss = (int) size;

        int start = 0;
        int[][] x = new int[sss][sss];
        for (int i = 0; i < sss; i++) {
            for (int j = 0; j < sss; j++) {
                x[i][j] = l.get(start);
                start++;
            }
        }

        int[][] y = transpose(x);
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < y[i].length; j++) {
                System.out.print(y[i][j] + " ");
            }
            System.out.println();
        }
    }
}
