package com.hackerrank.work.problemsolving.day15;

/***
 * 
 * @author jyodak
 *
 */
public class SingleNumberIII {
	
	/**
	 * Given an array of positive integers A, two integers appear only once, and all the other integers appear twice.<br>Find the two integers that appear only once.
	 * <b>Note:</b> Return the two numbers in ascending order.
	 * @param A The first argument is an array of integers of size N.
	 * @return Return an array of two integers that appear only once.
	 */
	public int[] solve(int[] A) {
	int[] retArr = new int[2];	
	//TODO XOR all the elements in the array
	int xor=0;
	for (int i = 0; i < A.length; i++) {
		xor = xor^A[i];		
	}
	
	//TODO find bitmask having right most bit;
	int bitmask = 1;
	
	for (int i = 1; i <= 32; i++) {
		if( (xor & bitmask) > 0)
		{
			break;
		}
		bitmask = bitmask<<1;
	}
	//TODO Apply bitmask to each number to figure out first number x 
	int x = 0;// Anything exored with zero is same number
	for (int i = 0; i < A.length; i++) {
		if( (bitmask & A[i]) >0 )
		{
			x=x^A[i];
		}
	}//end derive x
	int y = x^xor; 
	if( x>y)
	{
		retArr[0]=y;
		retArr[1]=x;
	}
	else
	{
		retArr[0]=x;
		retArr[1]=y;
	}
	return retArr;
    }
}

