package com.hackerrank.work.problemsolving.week6.day20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckLongestPalinDrome {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] inpArr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
		System.out.println(new CheckLongestPalinDrome().longestPalindrome(inpArr[0]));
	}
	
	
	    public String longestPalindrome(String A) {
	    	String maxString = "";
	    	String currString = "";
	    	int maxLength = 0;
	    	int currLength = 0;
	    	
	    	char[] inpStr = A.toCharArray();
	    	for (int i = 0; i < inpStr.length; i++) {
				currString = findLongestPalendromeSubString(A, i, i);
				currLength = currString.length();
				if( currLength > maxLength )
				{
					maxString = currString;
					maxLength = currLength;
				}				
			}
	    	
	    	for (int i = 0; i < inpStr.length-1; i++) {
				currString = findLongestPalendromeSubString(A, i, i+1);
				currLength = currString.length();
				if( currLength > maxLength )
				{
					maxString = currString;
					maxLength = currLength;
				}				
			}
	    	
	    	return maxString;
	    }
	
	    public String findLongestPalendromeSubString( String inpStr , int leftCounter,int rightCounter)
	    {
	    	int retCount = 0;
	    	int i=leftCounter;
	    	int j = rightCounter;
	    	
	    	while (i>=0 && j <inpStr.length() &&  inpStr.charAt(i)==inpStr.charAt(j)){				
				i--;
				j++;
			}//end of loop
	    	
	    	return inpStr.substring(i+1, j);
	    }
	    

}
