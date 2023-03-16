package com.hackerrank.work.problemsolving.day17;

/**
 * 
 * @author dilipdmane
 *
 */
public class DivisibleBy8 {

	/**
	 * You are given a number A in the form of a string. Check if the number is
	 * divisible by eight or not. Return 1 if it is divisible by eight else, return
	 * 0. <br>
	 * </b>Problem Constraints</b>1 <= length of the String <= 100000 '0' <= A[i] <=
	 * '9'
	 * 
	 * @param A The only argument given is a string A.
	 * @return Return 1 if it is divisible by eight else return 0.
	 */
	public int solve(String A) {
		int ret = 0;

		if (A.length() > 2) {
			/**
			 * A number is divisible by 8 if the hundreds digit is even and the last two
			 * digits form a number that is divisible by 8.
			 */
			if (Integer.parseInt(String.valueOf(A.charAt(A.length() - 3))) % 2 == 0) {
				ret = Integer.parseInt(A.substring(A.length() - 2)) % 8 == 0 ? 1 : 0;
			}
			/**
			 * A number is also divisible by 8 if the hundreds digit is odd and the number
			 * formed by the last two digits plus 4 is divisible by 8.
			 */
			else {
				ret = (Integer.parseInt(A.substring(A.length() - 2)) + 4) % 8 == 0 ? 1 : 0;
			}
		} else {
			ret = Integer.parseInt(A) % 8 == 0 ? 1 : 0;
		}
		return ret;
	}
}
