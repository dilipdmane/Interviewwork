package com.hackerrank.work.problemsolving.week5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FindEquilibriumIndex {
    public static void main(String[] args) throws IOException{
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS 
        // E.g. 'Scanner' for input & 'System.out' for output
          BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	         //TODO Take First line using buffer reader and seperate element by space.
	        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
	  	   	 	ArrayList<Integer> inpArray = new ArrayList<Integer>(firstMultipleInput.length);
	  	   	 	for (int i = 0; i < firstMultipleInput.length; i++) {
					inpArray.add(Integer.valueOf(firstMultipleInput[i]).intValue());
				}
	   	 System.out.println(FindEquilibriumIndex.solve( inpArray));
    }

    public static int  solve(ArrayList<Integer> A)
	{
    	int retValue= -1;			
    	int n = A.size();
    	int sumOfLeft = 0;
    	int sumOfRight = 0;
    	int[]  ps = new int[n];    	
    	ps[0]=A.get(0);    	
    	for (int i = 1; i < n; i++) {
			ps[i] = ps[i-1]+A.get(i);
		}    	
    	for (int i = 0; i < n; i++) {
    		if( i ==0 )
    		{
    			//(s,e) = > (1,n-1) = > sumOfLeft = ps (e) - ps (s-1) 
    			sumOfLeft=0;
    			sumOfRight =ps[n-1]-ps[0]; 
    		}
    		else if (i==n-1)
    		{
    			//(0,n-2)
    			sumOfLeft=ps[n-2]-ps[0];
    			
    			sumOfRight = 0;
    		}
    		else
    		{
    			// (0,i-1)
    			sumOfLeft = ps[i-1];    			
    			//(i+1,n-1)
    			sumOfRight = ps[n-1]-ps[i];
    		}    		
    		if(sumOfLeft == sumOfRight) return i;
		}
    	return retValue;
	}
    
    
}