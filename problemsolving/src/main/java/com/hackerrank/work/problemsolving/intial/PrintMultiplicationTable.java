package com.hackerrank.work.problemsolving.intial;

import java.util.Iterator;
import java.util.Scanner;

public class PrintMultiplicationTable {
    public static void main(String[] args) {
    	 Scanner myObj = new Scanner(System.in);
    			 int nextInt = myObj.nextInt();
    	printMultiplicationTable(nextInt); 
    }
    
    static void printMultiplicationTable(int num)
    {
    	int sum = 0;
    	for( int i=1;i<=10;i++)
    	{
    		sum = sum+num;
    		System.out.println(num+" * "+i+" = "+ sum);
    	}   		
    }
}