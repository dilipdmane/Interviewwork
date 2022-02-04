package com.hackerrank.work.problemsolving.week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindOutAgPair {
	
	/***
	 * Build Left Max Array
	 * RM[i] = MAX( RM[i+1],A[i] ) ;
	 * 
	 * for i=(N-1) => RM[ N-1] = A[N-1];
	 * @throws IOException 
	 * */
	public static void main(String[] args) throws IOException {
		  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	         //TODO Take First line using buffer reader and seperate element by space.
	        String Input = bufferedReader.readLine().replaceAll("\\s+$", "");
	        char[] inpArr= Input.toCharArray();
	  	   	 System.out.println(new FindOutAgPair().countOfAgPair(inpArr));
	}
	
	/**
	 * <code>counta</code> : total number of "a" in the given input array
	 * <code>ans</code> : total number of pairs having "ag"
	 *   Increase count of <code>counta</code>
	 *   by every occurance of "A" and then on every occurrence of  "g" please add value of <code>counta</code> to value of <code> ans</code>
	 * @param inpArr
	 * @return
	 */
	private int countOfAgPair(char[] inpArr)
	{
		int ans=0;
		int counta=0;	
		for (int i = 0; i < inpArr.length; i++) {
			if( inpArr[i] =='a')
			{
				counta++;
			}
			else if( inpArr[i] == 'g')
			{
				ans=ans+counta;
			}
				
		}
		
		return ans;
	}
	
	public int solve(String A) {
	    	int ans=0;
			int counta=0;	
			char[] inpArr = A.toCharArray();
			for (int i = 0; i < inpArr.length; i++) {
				if( inpArr[i] =='a')
				{
					counta++;
				}
				else if( inpArr[i] == 'g')
				{
					ans=ans+counta;
				}
					
			}
			
			return ans;
	    }
	

}
