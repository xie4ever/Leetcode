package com.xie.exam;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author xie4ever
 * @date 2019/10/23 17:28
 */
public class test3 {

    //10.0.0.0~10.255.255.255（A类）
    //172.16.0.0~172.31.255.255（B类）
    //192.168.0.0~192.168.255.255（C类）
    public static boolean fuckyou(long fuck) {
        BigDecimal aS, aL, bS, bL, cS, cL = new BigDecimal(0);

        BigDecimal bigFuck = new BigDecimal(fuck);

        aS = new BigDecimal((10 * 256 * 256 * 256) + (0 * 256 * 256) + (0 * 256) + (0 * 1));
        aL = new BigDecimal((10 * 256 * 256 * 256) + (255 * 256 * 256) + (255 * 256) + (255 * 1));

        bS = new BigDecimal((172 * 256 * 256 * 256) + (16 * 256 * 256) + (0 * 256) + (0 * 1));
        bL = new BigDecimal((172 * 256 * 256 * 256) + (31 * 256 * 256) + (255 * 256) + (255 * 1));

        cS = new BigDecimal((192 * 256 * 256 * 256) + (168 * 256 * 256) + (0 * 256) + (0 * 1));
        cL = new BigDecimal((192 * 256 * 256 * 256) + (168 * 256 * 256) + (255 * 256) + (255 * 1));

        if (bigFuck.compareTo(aS) > -1 && bigFuck.compareTo(aL) < 1) {
            return true;
        }

        if (bigFuck.compareTo(bS) > -1 && bigFuck.compareTo(aL) < 1) {
            return true;
        }

        if (bigFuck.compareTo(cS) > -1 && bigFuck.compareTo(aL) < 1) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long number = sc.nextLong();
        long original = number;

        int i = 0;
        char[] S = new char[100];
        if (number == 0) {
            System.out.print("0" + " " + "false");
        } else {
            while (number != 0) {
                long t = number % 16;
                if (t >= 0 && t < 10) {
                    S[i] = (char) (t + '0');
                    i++;
                } else {
                    S[i] = (char) (t + 'A' - 10);
                    i++;
                }
                number = number / 16;
            }

            StringBuilder st = new StringBuilder("0x");

            for (int j = i - 1; j >= 0; j--) {
                st.append(S[j]);
            }

            System.out.println(st.toString() + " " + fuckyou(original));
        }
    }
}
