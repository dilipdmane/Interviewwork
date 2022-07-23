package com.hackerrank.work.problemsolving.week3.day9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PickFromBothSide {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //TODO Take First line using buffer reader and seperate element by space.
       String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
       int b = Integer.valueOf(firstMultipleInput[0]).intValue();
       String[] secondLine = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
       ArrayList<Integer> A = new ArrayList<>(secondLine.length);
       for (int i = 0; i < secondLine.length; i++) {
    	   A.add( Integer.valueOf(secondLine[i]) );		
       }//end of for loop       
       System.out.println( "Value ["+ new PickFromBothSide().solve(A, b)+"]");
	}
	
	public int solve(ArrayList<Integer> A, int B) {
		 int maxSum =  0;
		 int n = A.size();
		 int[] prefix = new int[A.size()];	 
		 
		//TODO Get prefix sum
		 prefix[0] = A.get(0);
		 for (int i = 1; i < n; i++) {
			prefix[i]=prefix[i-1]+A.get(i);
		}	 
		 
		 //TODO Get Suffix Sum
		 int[] sufix = new int[A.size()];
		 sufix[n-1] = A.get(n-1);
		 
		 for (int i = n-2; i>= 0; i-- ){
			 sufix[i]=sufix[i+1]+A.get(i);
		}
		 
		 int leftSum = 0;
		 int rightSum = 0;
		 
		 maxSum = sufix[n-B];// First we take sum of all elements from back 

		 //TODO Start iterating from left  and take one out of left
		 for( int i=0;i<B-1;i++)
		 {
			 leftSum = prefix[i];
			 rightSum = sufix[ n- ( B- ( i+1)  )];
			 //System.out.println("maxSum ["+(leftSum+rightSum)+"]");
			 maxSum = Math.max(maxSum, leftSum+rightSum);
			 
		 }
		 //System.out.println("maxSum ["+ prefix[B-1]+"]");
		 maxSum = Math.max(maxSum, prefix[B-1]);
		
		 return maxSum; 
	   }
	
	 
}
