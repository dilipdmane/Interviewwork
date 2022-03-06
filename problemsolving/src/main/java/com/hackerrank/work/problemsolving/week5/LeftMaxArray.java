package com.hackerrank.work.problemsolving.week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeftMaxArray {
	
	/***
	 * TODO Build Left Max Array
	 * LM[i] = MAX( LM[i-1],A[i] ) ;
	 * 
	 * for i=0 => LM[0] = A[0];
	 * */
	
	public static void main(String[] args) throws IOException {
		  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	         //TODO Take First line using buffer reader and seperate element by space.
	        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
	  	   	 	int[] inpArray = new int[firstMultipleInput.length];
	  	   	for (int i = 0; i < firstMultipleInput.length; i++) {
				inpArray[i]=Integer.valueOf(firstMultipleInput[i]).intValue();
			}
	  	   	 new LeftMaxArray().getLeftMostArray(inpArray);
	}

	private int[] getLeftMostArray(int[] inpArr) {
		int n= inpArr.length;
		int[] retArr = new int [inpArr.length];		
		retArr[0]=inpArr[0];//LeftMax Array
		System.out.print(retArr[0]+" ");
		for (int i = 1; i < n; i++) {
			retArr[i]= Math.max( retArr[i-1], inpArr[i]);
			System.out.print(retArr[i]+" ");
		}		
		return retArr;
	}

}
