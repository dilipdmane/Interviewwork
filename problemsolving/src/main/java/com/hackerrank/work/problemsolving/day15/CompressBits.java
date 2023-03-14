package com.hackerrank.work.problemsolving.day15;

public class CompressBits {

	 public int compressBits(int[] A) 
	 {
		 int ans = 0;
		 for (int i = 0; i < A.length-1; i++) {
			 int a= A[i];
			 int b = A[i+1];
			 A[i]=a&b;
			A[i+1]=a|b;
			ans=ans^A[i];
		}
		 return ans^A[A.length-1];
	 }

}
