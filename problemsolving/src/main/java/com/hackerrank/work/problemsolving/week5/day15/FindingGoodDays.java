package com.hackerrank.work.problemsolving.week5.day15;

public class FindingGoodDays {
	
	public static void main(String[] args) {
		System.out.println(new FindingGoodDays().solve(5));
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

