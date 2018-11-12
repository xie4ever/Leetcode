package com.xie.leetcode.array;

/**
 * @author xie4ever
 */
public class OnebitAndTwobitCharacters {

	public static boolean isOneBitCharacter(int[] bits) {
		System.out.println("length = " + bits.length);

		int i = 1;
		if (bits[i - 1] == 1) {
			i += 2;
		} else {
			i++;
		}

		while (i < bits.length) {
			System.out.println(i);
			if (bits[i - 1] == 1) {
				i += 2;
			} else {
				i++;
			}
		}

		if (i == bits.length) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		int[] bits1 = new int[] { 1, 0, 0 };
		int[] bits2 = new int[] { 1, 1, 1, 0 };

		System.out.println(isOneBitCharacter(bits1));
		System.out.println(isOneBitCharacter(bits2));
	}
}
