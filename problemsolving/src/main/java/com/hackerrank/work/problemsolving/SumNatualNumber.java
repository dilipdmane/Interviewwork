package com.hackerrank.work.problemsolving;

import java.util.Scanner;

public class SumNatualNumber {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
    	 Scanner myObj = new Scanner(System.in);
    			 int nextInt = myObj.nextInt();
    	System.out.println( sum(nextInt)); 
    	
        
    }
    
    static int sum(int num)
    {
    	int sum = 0;
       	sum=(num*(num+1))/2;
    	return sum;
    }
}