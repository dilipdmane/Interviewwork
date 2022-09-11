package com.hackerrank.work.problemsolving.week6.day20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseStatement {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] inpArr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
		System.out.println(new ReverseStatement().solve(inpArr[0]));
	}
	
	
	public String solve(String A) {
		String retStr ="";
		char[] charArray = A.toCharArray();
		int l=0;
		int r=charArray.length-1;
		
		while( l <r)
		{
			char ch = charArray[l];
			charArray[l]=charArray[r];
			charArray[r]=ch;
			l++;
			r--;
		}
		retStr = new String(charArray);
		
		return retStr;
    }
	
	    

}
