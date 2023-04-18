package com.hackerrank.work.problemsolving.day24;

/**
 * @author dilipdmane
 *
 */
public class SumOfDigitsMagicNUmber {
	
	/**
	 * Given a number A, we need to find the sum of its digits using recursion.
	 * @param A The first and only argument is an integer A.
	 * @return Return an integer denoting the sum of digits of the number A.
	 */
	
	
	public int solve(int A) {
		return (A%9==1)?1:0;
    }

}
