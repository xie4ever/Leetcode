package com.xie.leetcode.array;

public class OnebitAndTwobitCharactersDay3 {

	public static boolean isOneBitCharacter(int[] bits) {

		int i = 0;

		while (i < bits.length - 1) {

			System.out.println(i);

			if (bits[i] == 1) {

				i += 2;

			} else {

				i++;
			}
		}

		if (i == bits.length - 1) {

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
