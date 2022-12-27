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
public class StarPatternI {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		String firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "");
		int n = Integer.parseInt(firstMultipleInput);
		int totalrow = n * 2;
		StringBuffer result = new StringBuffer();
		int startIndex = 0;
		int endIndex = 0;
		for (int i = 0; i < totalrow; i++) {
			if (n >= i) {
				startIndex = (n - i) == 0 ? 1 : n - i;
			} else {
				startIndex = i - n + 1;
			}
			endIndex = totalrow - startIndex;
			for (int j = 0; j < totalrow; j++) {
				if (i > 0 & i < totalrow - 1) {
					if (j >= startIndex && j < endIndex) {
						result.append(" ");
					} else {
						result.append("*");
					}
				} else {
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
