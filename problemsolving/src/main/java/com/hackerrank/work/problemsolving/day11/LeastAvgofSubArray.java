package com.hackerrank.work.problemsolving.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.hackerrank.work.problemsolving.Utility;

public class LeastAvgofSubArray {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String[] firstAInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");		
        ArrayList<Integer> A = Utility.getInstance().convertStringArraytoIntArrayList(firstAInput);
        System.out.println("LeastAvgofSubArray.main() ["+ new LeastAvgofSubArray().solve(A, 9)+"]");
	}	
	
	/**
	 * 
	 * @param A
	 * @return
	 */
	public int solve(ArrayList<Integer> A, int B) {
		int retIndex = -1;
		int n = A.size();
		double avg = Double.MAX_VALUE;
		
		
		//TODO prefix sum
		int[] pSum = new int[n];
		
		pSum[0]=A.get(0).intValue();
		for ( int i=1;i<n;i++)
		{
			pSum[i]=pSum[i-1]+A.get(i).intValue();
		}
		
		for( int i=0;i<=n-B;i++)
		{
			double sAvg;			
			
			if( B>1)
			{
				if( i > 0)
				{
					sAvg =(double)( pSum[ i+(B-1)]-pSum[ i-1] )/B;					
				}
				else
				{
					sAvg =  (double)pSum[ i+(B-1)] / B; 
				}
			}
			else
			{
				sAvg = A.get(i).floatValue();
			}
			//System.out.println( "Index ["+i+"["+sAvg+"]");
			if( sAvg < avg)
			{
				retIndex =i;
				avg = sAvg;
			}
		}
		return retIndex;
    }
	
	
}
