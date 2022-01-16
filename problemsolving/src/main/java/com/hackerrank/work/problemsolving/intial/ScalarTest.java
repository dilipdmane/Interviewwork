package com.hackerrank.work.problemsolving.intial;

public class ScalarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	    public int solve(int[] A, int B) {
	    	int retStr = -1;
	    	for(int i=0;i<A.length;i++) 
	    	{
	    		for(int j=1;j<A.length;j++)
	    		{
	    			if( A[i]+A[j]==B)
	    			{
	    				retStr++;
	    			}
	    		}
	    	}
	    	return retStr;
	    }
}//end Str
