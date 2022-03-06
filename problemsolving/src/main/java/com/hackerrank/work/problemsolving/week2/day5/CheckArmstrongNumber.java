package com.hackerrank.work.problemsolving.week2.day5;

import java.util.Scanner;

public class CheckArmstrongNumber {
    public static void main(String[] args) {
    	 Scanner myObj = new Scanner(System.in);
    			 int nextInt = myObj.nextInt();
    	printArmStrongNumber(nextInt); 
    }
    
    static void printArmStrongNumber(int num)
    {
    	for( int i=1;i<=num;i++)
    	{
    		int m=i;    		
    		int sum = 0;
    		while( m >0 )
    		{
    			//System.out.println("CheckArmstrongNumber.printArmStrongNumber() ["+counter+"]++["+(m%10)+"]");
    			int digit = (m%10);
    			sum = sum+(digit*digit*digit);
    			m = m/10;    			
    		}
    		
    		if( sum == i )
    		{
    			System.out.println("CheckArmstrongNumber.printArmStrongNumber() ["+i+"]");
    		}
    		
    	}   		
    }
}