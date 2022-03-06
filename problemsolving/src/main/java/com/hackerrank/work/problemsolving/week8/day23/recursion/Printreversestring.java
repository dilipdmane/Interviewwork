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
Write a recursive function that, given a string S, prints the characters of S in reverse order.
 * </p>
<p>
<h1>Problem Constraints</h1>
1 <= |s| <= 1000
</p>
 *
 */
public class Printreversestring {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String firstAInput = bufferedReader.readLine().replaceAll("\\s+$", "");		
        System.out.println(new Printreversestring().reverseString( firstAInput));       
        
	}
	
	public String reverseString(String inpStr) {
		
		StringBuilder inpStringBuilder = new StringBuilder(inpStr);		
		return reverseStr(inpStringBuilder, 0, inpStr.length()-1).toString();	
		
    }
	
	public StringBuilder reverseStr( StringBuilder inBuilder, int left, int right )
	{
		if( left > right ) return inBuilder;
		char ch = inBuilder.charAt(left);
		inBuilder.setCharAt(left,inBuilder.charAt(right));
		inBuilder.setCharAt(right, ch);
		return reverseStr(inBuilder, left+1, right-1);
	}

}
