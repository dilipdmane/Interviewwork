package com.hackerrank.work.problemsolving;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
    	 Scanner myObj = new Scanner(System.in);
    			 int nextInt = myObj.nextInt();
    	System.out.println( new PerfectSquare().solve(nextInt)); 
    	
        
    }
    
    public int solve(int num) {
        
        long mid=0;
        long left = 1;
        long right = num;
    	
    	while (left <=right) {
			mid = (left+right)/2;
			System.out.println("PerfectSquare.solve() mid ["+ mid+"]\t Left ["+left+"]\t ["+right+"] ["+(mid*mid)+"]");
			if( (mid*mid)>num )
			{
				right = mid-1;
			}
			else if( (mid*mid) < num)
			{
				left = mid+1;
			}	
			else if ((mid*mid)==num)
			{
				return (int)mid;
			}
		}
       	
    	return -1;
    }
}