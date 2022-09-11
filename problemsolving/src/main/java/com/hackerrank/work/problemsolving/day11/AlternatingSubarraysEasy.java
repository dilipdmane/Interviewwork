package com.hackerrank.work.problemsolving.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import com.hackerrank.work.problemsolving.Utility;

public class AlternatingSubarraysEasy {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String[] firstAInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");		
        ArrayList<Integer> A = Utility.getInstance().convertStringArraytoIntArrayList(firstAInput);
        System.out.println("LeastAvgofSubArray.main() ["+ new AlternatingSubarraysEasy().solve(A,1)+"]");
	}	

	
	
/**
 * 
 * You are given an integer array A of length N comprising of 0's & 1's, and an integer B.

You have to tell all the indices of array A that can act as a center of 2 * B + 1 length 0-1 alternating subarray.

A 0-1 alternating array is an array containing only 0's & 1's, and having no adjacent 0's or 1's. For e.g. arrays [0, 1, 0, 1], [1, 0] and [1] are 0-1 alternating, while [1, 1] and [0, 1, 0, 0, 1] are not.
 */
public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
	ArrayList<Integer> retArray = new ArrayList<>();	
    for(int i=0;i<A.size() ;i++){ 	  
    	if( (i+2*B) <A.size() )
    	{
    		int prev = A.get(i); //TODO get current values;
    		boolean isAlter = true;
    		for(int  j = i+1;j<=(i+2*B);j++)
    		{
    			if( (prev^A.get(j) )!=1 )
    			{
    				isAlter = false;
    				break;
    			}
    			prev = A.get(j);
    		}
    		if( isAlter )
    		{
    			retArray.add( i+B);
    		}
    	}
    }
	return retArray;
}

}
