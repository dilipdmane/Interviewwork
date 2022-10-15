package com.hackerrank.work.problemsolving.day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.hackerrank.work.problemsolving.Utility;

public class SpiralOrderMatrix {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
	       int rows = Integer.valueOf(firstMultipleInput[0]).intValue();
	      Utility.getInstance().printMatrix(new SpiralOrderMatrix().generateMatrix(rows), System.out);
	}
	
	/**
	 * Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order and return the generated square matrix.
	 * @param A
	 * @return
	 */
	 public int[][]  generateMatrix(int A) {
		int [][] ret = new int[A][A];
		int val =1;
		int i =0, j=0;
		int n = A;
		
		while( n> 1) {
		int count = 0;
			while( count < n-1)
			{
				ret[i][j]=val;
				j++;
				count++;
				val++;
			}
			count = 0;
			while( count < n-1)
			{
				ret[i][j]=val;
				i++;
				count++;
				val++;
			}
			count = 0;
			while( count < n-1)
			{
				ret[i][j]=val;
				j--;
				count++;
				val++;
			}
			count = 0;
			while( count < n-1)
			{
				ret[i][j]=val;
				i--;
				count++;
				val++;
			}
			
			i++;
			j++;
			n= n-2;
			
		}// end of outer while
		
		if( n==1)
		{
			ret[i][j]=val;
		}
		
		 
		 return  ret;
	    }
	
}
