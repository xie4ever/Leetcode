package com.xie.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xie4ever
 * @date 2018/12/20 16:31
 */
public class BinaryWatch {

    public List<String> readBinaryWatch(int num) {
        List<String> times = new ArrayList<>();
        for (int h = 0; h < 12; h++)
            for (int m = 0; m < 60; m++)
                if (Integer.bitCount(h * 64 + m) == num)
                    times.add(String.format("%d:%02d", h, m));
        return times;
    }
}
