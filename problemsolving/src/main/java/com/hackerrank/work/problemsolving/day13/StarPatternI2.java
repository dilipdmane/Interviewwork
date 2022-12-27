package com.hackerrank.work.problemsolving.day13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Write a program to input an integer N from user and print hollow diamond star
 * pattern series of N lines.<br>
 * See example for clarifications over the pattern.
 * 
 * @author jyodak
 *
 */
public class StarPatternI2 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		String firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "");
		int totalrow = Integer.parseInt(firstMultipleInput);		
		StringBuffer result = new StringBuffer();
		
		for (int i = 0; i < totalrow; i++) {			
			for (int j = 0; j < (totalrow-i); j++) {
				if( i>0)
				{
					if( j==0 || j==(totalrow-i)-1)
					{
						result.append("*");
					}
					else
					{
						result.append(" ");
					}
				}
				else
				{
					result.append("*");
				}
				
			}
			result.append("\n");
		}
		bufferedWriter.write(result.toString());
		bufferedWriter.newLine();
		bufferedReader.close();
		bufferedWriter.close();
	}
}// end of main
