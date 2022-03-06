package com.hackerrank.work.problemsolving.week2.day5;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
    	 Scanner myObj = new Scanner(System.in);
    			 int nextInt = myObj.nextInt();
    	System.out.println("Main.main() "+ isPrime(nextInt)); 
    	
        
    }
    
    static boolean isPrime(int num)
    {
       	for (int i=2;i<=num/2;i++)
		{
			if( num%i==0) return false;
		}
    	return true;
    }
}