package com.hackerrank.work.problemsolving.day17;

/**
 * 
 * @author dilipdmane
 *
 */
public class GreatestPossiblePositiveInteger {
	
	
	/**
	 *  Given two integers A and B, find the greatest possible positive integer M, such that A % M = B % M.
	 * @param A The first argument is an integer A.
	 * @param B The second argument is an integer B.
	 * @return Return an integer denoting the greatest possible positive M.
	 */
	public int solve(int A, int B) {
		/**
		 * A%M = B%M
		 * (A%M)-(B%M) = 0
		 * (A-B) %M = 0 
		 */
        if(A > B) {
            return A - B;
        }
        return B - A;
    }
}
