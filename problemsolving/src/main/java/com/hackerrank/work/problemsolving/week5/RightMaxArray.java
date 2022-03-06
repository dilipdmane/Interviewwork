package com.hackerrank.work.problemsolving.week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RightMaxArray {
	
	/***
	 * Build Left Max Array
	 * RM[i] = MAX( RM[i+1],A[i] ) ;
	 * 
	 * for i=(N-1) => RM[ N-1] = A[N-1];
	 * @throws IOException 
	 * */
	public static void main(String[] args) throws IOException {
		  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	         //TODO Take First line using buffer reader and seperate element by space.
	        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
	  	   	 	int[] inpArray = new int[firstMultipleInput.length];
	  	   	for (int i = 0; i < firstMultipleInput.length; i++) {
				inpArray[i]=Integer.valueOf(firstMultipleInput[i]).intValue();
			}
	  	   	 new RightMaxArray().getRightMostArray(inpArray);
	}
	
	private int[] getRightMostArray(int[] inpArr)
	{
		int n= inpArr.length;
		int[] retArr = new int [inpArr.length];		
		retArr[n-1]=inpArr[n-1];//RightMax Array
		System.out.print(retArr[n-1]+" ");
		for (int i = n-2; i >= 0; i--) {
			retArr[i]= Math.max( retArr[i+1], inpArr[i]);
			System.out.print(retArr[i]+" ");
		}		
		return retArr;
	}

}
