package com.hackerrank.work.problemsolving.day17;

/**
 * 
 * @author dilipdmane
 *
 */
public class FindExcelColumnNumber {
	
	
	/**
	 *  Given a column title as appears in an Excel sheet, return its corresponding column number.
	 *  <br><b>Problem Constraints</b>1 <= length of the column title <= 5
	 * @param A The only argument is a string that represents the column title in the excel sheet.
	 * @return Return a single integer that represents the corresponding column number.
	 */
	 public int titleToNumber(String A) 
	 {
		 int ans=0;
		 int x=1;
		 int n = A.length();
		 int i=1;
		 while (n>0)
		 {
			 //TODO : Get the exponential values of 26 depend on position of element ( starting from 0)
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
