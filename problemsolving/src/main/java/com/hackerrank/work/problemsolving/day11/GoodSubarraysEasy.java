package com.hackerrank.work.problemsolving.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.hackerrank.work.problemsolving.Utility;

public class GoodSubarraysEasy {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String[] firstAInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");		
        ArrayList<Integer> A = Utility.getInstance().convertStringArraytoIntArrayList(firstAInput);
        System.out.println("LeastAvgofSubArray.main() ["+ new GoodSubarraysEasy().solve(A,10)+"]");
	}	

	
	
/**
 * Given an array of integers A, a sub-array of an array is said to be good if it fulfills any one of the criteria:
1. Length of the sub-array is be even, and the sum of all the elements of the sub-array must be less than B.
2. Length of the sub-array is be odd, and the sum of all the elements of the sub-array must be greater than B.
Your task is to find the count of good sub-array in A.	
 * @param A
 * @param B
 * @return
 
 */
public int solve(ArrayList<Integer> A, int B) {
	int retArray = 0;
	
    for(int i=0;i<A.size();i++){
  	  int sum = 0;
  	  int sizeCount = 0;
        for (int j = i; j < A.size(); j++) {
			sum = 	sum+A.get(j);
			
			if( sum <B && sizeCount%2==0) // Sum is greater than  B and array size is ODD
			{
				retArray++;
			}
			else if( sum >B && sizeCount%2!=0)//Sum is greater than  B and array size is Even.
			{
				retArray++;
			}				
		}          
    }
	return retArray;
}
	
	
}
