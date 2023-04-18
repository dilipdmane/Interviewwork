package com.hackerrank.work.problemsolving.day23;

/**
 * @author dilipdmane
 *
 */
public class SumOfDigits {
	
	/**
	 * Given a number A, we need to find the sum of its digits using recursion.
	 * @param A The first and only argument is an integer A.
	 * @return Return an integer denoting the sum of digits of the number A.
	 */
	public int solve(int A) {		
		if( A<10) return A;
		return (A%10)+solve(A/10);
    }

}
