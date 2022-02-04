package com.hackerrank.work.problemsolving.week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LengthOfSubArraywithMinMax {
	
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
				inpArray[i]= Integer.valueOf(firstMultipleInput[i]).intValue();
			}
	        
	  	   	System.out.println( new LengthOfSubArraywithMinMax().getRightMostArray(inpArray));
	}
	
	private int getRightMostArray(int[] inpArr)
	{
		int leftMax = -1;
		int leftMin = -1;
		int length = inpArr.length;
		int max = inpArr[0];
		int min = inpArr[0];
		for (int i = 1; i < inpArr.length; i++) {			
			min = inpArr[i] < min ? inpArr[i]:min; 
			max = inpArr[i] > max ? inpArr[i]:max;			
		}		
		for (int i = 0; i < inpArr.length; i++) {
			if( inpArr[i]==max)
			{
				leftMax = i;
				if( leftMin > -1 )
				{
					int nearstMin = ( (i-leftMin)+1) ;
					length = (nearstMin>0 && nearstMin<length)  ? nearstMin : length;
				}
			}
			 if(inpArr[i]==min)
			{
				leftMin = i;
				if( leftMax > -1 )
				{
					int nearstMax = ( (i-leftMax)+1) ;
					length = (nearstMax>0 && nearstMax<length)  ? nearstMax : length;
				}
			}
		}
		return length;
	}
	
	 public int solve(ArrayList<Integer> A) {
		 int leftMax = -1;
			int leftMin = -1;
			int length = A.size();
			int max = A.get(0);
			int min = A.get(0);
			for (int i = 1; i < A.size(); i++) {			
				min = A.get(i) < min ? A.get(i):min; 
				max = A.get(i) > max ? A.get(i):max;			
			}		
			for (int i = 0; i < A.size(); i++) {
				if( A.get(i)==max)
				{
					leftMax = i;
					if( leftMin > -1 )
					{
						int nearstMin = ( (i-leftMin)+1) ;
						length = (nearstMin>0 && nearstMin<length)  ? nearstMin : length;
					}
				}
				if(A.get(i)==min)
				{
					leftMin = i;
					if( leftMax > -1 )
					{
						int nearstMax = ( (i-leftMax)+1) ;
						length = (nearstMax>0 && nearstMax<length)  ? nearstMax : length;
					}
				}
			}
			return length;
	    }

	

}
