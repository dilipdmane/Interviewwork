package com.hackerrank.work.problemsolving.day17;

public class FindExcelColumnNumber {

	 public int titleToNumber(String A) 
	 {
		 int ans=0;
		 int x=1;
		 int n = A.length();
		 int i=1;
		 
		 while (n>0)
		 {
			 if( i > 1)
			 {
				 x=x*26;
			 }
			 
			 ans = ans+(A.charAt(n-1)-65+1)*x;
			 i++;
			 n--;
		 }
		 
		 return ans;
	 }

}
