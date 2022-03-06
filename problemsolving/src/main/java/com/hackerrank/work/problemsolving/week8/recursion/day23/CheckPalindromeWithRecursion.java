package com.hackerrank.work.problemsolving.week8.recursion.day23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/***
 * 
 * @author jyodak
 * <p>
 * <h1>Problem Description</h1>
 * </p>
<p>
<h1>Problem Constraints</h1>

</p>
 *
 */

public class CheckPalindromeWithRecursion {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String firstAInput = bufferedReader.readLine().replaceAll("\\s+$", "");		
        System.out.println(new CheckPalindromeWithRecursion().solve(firstAInput));       
        
	}
	
	public int solve(String A) {
		int ret=0;
		if( checkPalinDrome(A, 0, A.length()-1)) return 1;
		return ret;
    }
	
	public boolean checkPalinDrome( String str, int start, int end)
	{
		if( start > end ) return true;
		if( str.charAt(start)==str.charAt(end))
		{
			return checkPalinDrome(str, start+1, end-1);
		}
		
		return false;
	}

}
