package com.hackerrank.work.problemsolving.day15;

public class HelpFromSam {
	
	public static void main(String[] args) {
		System.out.println(new HelpFromSam().solve(5));
	}
	
	
	public int solve(int A) {
		char[] binaryString = Integer.toBinaryString(A).toCharArray();
				int count = 0;
		for (int i = 0; i < binaryString.length; i++) {
			if( binaryString[i]=='1')count++;			
		}
		
	    return count;
	}
	
	
	
	
	

}

