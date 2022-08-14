package com.hackerrank.work.problemsolving.week3.day10;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * @author jyodak
 *
 */
public class EvenSubaray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new EvenSubaray().solve(args[0]);
		//System.out.println("["+solve+"]");
	}	
	
	/**
	 * You are given an integer array A.Decide whether it is possible to divide the array into one or more subarrays of even length such that the first and last element of all subarrays will be even.
		Return "YES" if it is possible; otherwise, return "NO" (without quotes).
	 * @param A
	 * @return
	 */
	public String solve(ArrayList<Integer> A) {
        String ret ="NO";
        
        if( !A.isEmpty()&& A.size() %2 == 0 && A.get(0).intValue() %2 ==0 && A.get(A.size()-1).intValue() %2==0) {
        	return "YES";
        }
        return ret;
    }
	
}
