package com.hackerrank.work.problemsolving.week8.day23.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.hackerrank.work.problemsolving.Utility;

/***
 * 
 * @author jyodak
 * <p>
 * <h1>Problem Description</h1>
 *he Fibonacci numbers are the numbers in the following integer sequence.</br>0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..
In mathematical terms, the sequence Fn of Fibonacci numbers is defined by the recurrence relation:.</br>Fn = Fn-1 + Fn-2.</br>.</br>Given a number A, find and return the Ath Fibonacci Number..</br>Given that F0 = 0 and F1 = 1.
 * </p>
<p>
<h1>Problem Constraints</h1>
0 <= A <= 20
</p>
 *
 */
public class FindFactorial {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String firstAInput = bufferedReader.readLine().replaceAll("\\s+$", "");		
        System.out.println(new FindFactorial().findAthFibonacci(Integer.valueOf(firstAInput).intValue()));       
        
	}
	
	public int findAthFibonacci(int A) {
		int sum = 0;
		if( A<=1) return A; 
		sum = sum+ (findAthFibonacci(A-1)+findAthFibonacci(A-2));
		return sum;
    }

}
