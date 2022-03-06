package com.hackerrank.work.problemsolving.week6.day20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseSting {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inpArr = bufferedReader.readLine().replaceAll("\\s+$", "");
        int ch = (int ) 'a';
        System.out.println(ch);
		System.out.println(new ReverseSting().solve(inpArr));
	}
	
	
	 public String solve(String A) 
	 {
		 String retStr = A.trim();
		 retStr = reverse(A, 0, retStr.length()-1);
		 int left = 0;
		 int right = 0;
		 for (int i = 0; i < retStr.length(); i++) {
			if( retStr.charAt(i)==' ')
			{
				right = i-1;
				retStr = reverse(retStr, left, right);
				left = i+1;
			}
		}
		 retStr = reverse(retStr, left, retStr.length()-1);
		 
		 return retStr;
	 }
	
	
	public String reverse(String inpStr , int l , int r) {
		String retStr ="";
		char[] charArray = inpStr.toCharArray();	
		
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
