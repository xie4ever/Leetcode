package com.xie.leetcode.easy;

import java.util.HashMap;

/**
 * @author xie4ever
 * @date 2018/11/24 23:31
 */
public class ExcelSheetColumnTitle {

    public String convertToTitle(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        while (n > 0) {
            int i = (n - 1) % 26;
            stringBuilder.append((char)(i + 'A'));
            n = (n - 1)/26;
        }
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        ExcelSheetColumnTitle excelSheetColumnTitle = new ExcelSheetColumnTitle();
        System.out.println(excelSheetColumnTitle.convertToTitle(52));
    }
}
