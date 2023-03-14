package com.hackerrank.work.problemsolving.day15;

public class MaximumSatisfaction {

	public int solve(int[] A) {
		int ans = 0;
		int window = 4;
		//TODO:: Start with most significant digits
		for (int i = 31; i >=0; i--) {
			int numberOfSetBit = 0;
			for( int j =0; j<A.length;j++)
			{
				if( checkIfBitSetAtPos(A[j], i))
				{
					numberOfSetBit++;
				}
			}
			if( numberOfSetBit >= window)
			{
				//TODO set bit to 1 for every set bit
				ans = setBitAtPosition(ans, i);
				//unset array element whose one bit is not set
				unsetAllBitsInElement(A, i);
			}
		}
		return ans;
	}

	public boolean checkIfBitSetAtPos(int a, int pos) {
		return (a & (1 << pos)) > 0;
	}

	public int setBitAtPosition(int a, int pos) {
		return (a | (1 << pos));
	}

	public void unsetAllBitsInElement(int[] a, int pos) {
		for (int i = 0; i < a.length; i++) {
			if (!checkIfBitSetAtPos(a[i], pos)) {
				a[i] = 0;
			}
		}
	}

}
