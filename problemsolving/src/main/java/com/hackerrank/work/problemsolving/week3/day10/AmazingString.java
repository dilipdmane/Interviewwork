package com.hackerrank.work.problemsolving.week3.day10;

public class AmazingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int solve = new AmazingString().solve(args[0]);
		System.out.println("["+solve+"]");
	}	
	
	/***
	 * 
	 *  You are given a string S, and you have to find all the amazing substrings of S.<br/>An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U
	 * @param A given is string S.
	 * @return Return a single integer X mod 10003, here X is the number of Amazing Substrings in given the string
	 */
	 public int solve(String A) {
		 int retValue = 0;		 
		 char[] charArray = A.toCharArray();
		 for (int i = 0; i < charArray.length; i++) {
			 char lower = Character.toLowerCase( charArray[i]);	 
			 if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
			 retValue = ( retValue+ (charArray.length-i) ) % 1003;			 			
			 }
	    }
		 return retValue;
	 }//end of method
	
}
