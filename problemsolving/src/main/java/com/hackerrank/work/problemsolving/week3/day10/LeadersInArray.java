package com.hackerrank.work.problemsolving.week3.day10;

import java.util.ArrayList;

public class LeadersInArray {

	public static void main(String[] args) {
		
		//new EvenSubaray().solve(args[0]);
		//System.out.println("["+solve+"]");
	}	
	
	/**
	 * 
	 * @param A
	 * @return
	 */
	public  ArrayList<Integer>  solve(ArrayList<Integer> A) {
     ArrayList<Integer> ret = new ArrayList<>();
     if( !A.isEmpty())
     {
    	  int currMax = A.get(A.size()-1).intValue();
    	  ret.add(currMax);
    	  for ( int i = A.size()-2; i<=0;i--)
    	  {
    		  if( A.get(i).intValue() > currMax)
    		  {
    			  ret.add(A.get(i).intValue());
    			  currMax = A.get(i).intValue();
    		  }
    	  }
     }
     return ret;
   }
	
}
