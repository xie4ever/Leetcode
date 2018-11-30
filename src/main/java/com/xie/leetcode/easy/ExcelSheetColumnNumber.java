package com.xie.leetcode.easy;

/**
 * @author xie4ever
 * @date 2018/11/26 18:34
 */
public class ExcelSheetColumnNumber {

    public int titleToNumber(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int value = s.charAt(i) - 'A' + 1;
            result = result + value * (int) Math.pow(26, s.length() - i - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        ExcelSheetColumnNumber excelSheetColumnNumber = new ExcelSheetColumnNumber();
        System.out.println(excelSheetColumnNumber.titleToNumber("ZY"));
    }
}