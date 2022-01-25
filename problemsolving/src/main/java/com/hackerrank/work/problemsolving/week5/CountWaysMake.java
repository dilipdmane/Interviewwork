package com.hackerrank.work.problemsolving.week5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CountWaysMake {
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
	   	 System.out.println(CountWaysMake.solve( inpArray));
    }

    public static int  solve(ArrayList<Integer> A)
	{
    	int n= A.size();
    	int removeCount = 0;
    	int[]  psEven = new int[n];
    	int[]  psOdd = new int[n];
    	psEven[0]=A.get(0);
    	psOdd[0]=0;    	
    	for (int i = 1; i < n; i++) {
    		if( i%2==0)
    		{
    			psEven[i]=psEven[i-1]+A.get(i);
    			psOdd[i]=psOdd[i-1]+0;
    		}
    		else
    		{
    			psEven[i]=psEven[i-1]+0;
    			psOdd[i]=psOdd[i-1]+A.get(i);
    		}
		}
    	
    	for (int i = 0; i < n; i++) {
    		int sumOfEven = 0;
    		int sumOfodd = 0;    		/*
    		 * SumEV = sumPSev(0,i-1)+sumpsOdd(i+1,n-1)
    		 * SumEV = psEven(i-1)+ ( [ psOdd[n-1]- psOdd[i]])
    		 * 
    		 * SumOdd = sumPSev(0,i-1)+sumpsOdd(i+1,n-1)
    		 * SumOdd = psOdd(i-1)+ ( [ psEven[n-1]- psEven[i]])
    		 * */    		
    		if ( i==0)
    		{
    			sumOfEven = 0+( psOdd[n-1]-psOdd[i]);
    			sumOfodd = 0+( psEven[n-1]-psEven[i]);
    		}
    		else
    		{
    			sumOfEven = psEven[i-1]+( psOdd[n-1]-psOdd[i]);
   			  	sumOfodd = psOdd[i-1]+( psEven[n-1]-psEven[i]);
    		}    		
    		if( sumOfEven == sumOfodd)
    		{
    			removeCount++;
    		}			
		}
    	
    	return removeCount;
	}
    
    
}