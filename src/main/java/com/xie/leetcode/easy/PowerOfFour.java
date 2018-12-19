package com.xie.leetcode.easy;

/**
 * @author xie4ever
 * @date 2018/12/18 18:52
 */
public class PowerOfFour {

    /**
     * 理论上数字4幂的二进制类似于100，10000，1000000，etc...形式。可以有如下结论：
     *
     * 4的幂一定是2的。
     * 4的幂和2的幂一样，只会出现一位1。但是，4的1总是出现在奇数位。
     * 0x5 = 0101b可以用来校验奇数位上的1。
     */
    public boolean isPowerOfFour(int num) {
        if (num <= 0 || (num & (num-1)) != 0) {
            return false;
        }
        return (num & 0x55555555) != 0;
    }

    public boolean isPowerOfFour2(int num) {
        if(num==0)
            return false;
        while(num%4==0)
            num/=4;
        return num==1;
    }
}
