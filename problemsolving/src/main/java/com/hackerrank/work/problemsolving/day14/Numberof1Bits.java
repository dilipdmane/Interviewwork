package com.hackerrank.work.problemsolving.day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.hackerrank.work.problemsolving.Utility;

public class Numberof1Bits {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// TODO Take First line using buffer reader and separate element by space.
		String firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "");
		int array = Integer.valueOf(firstMultipleInput).intValue();
		Utility.getInstance().printData(new Numberof1Bits().numSetBits(array), System.out);
	}

	public int numSetBits(int A) {
		int ret = 0;
		while (A / 2 != 0 ) {
			if (A % 2 == 1) ret++;
			A = A / 2;
		}
		if (A % 2 == 1) ret++;
		return ret;
	}
	
	/**
	 * Scalar Solution.
	 * @param A
	 * @return
	 */
	 public int numSetBits2(long A) {
	        int total_ones = 0;
	        while (A != 0) {
	            // rightmost set bit becomes unset
	            A = A & (A - 1);
	            total_ones++;
	        }
	        return total_ones;
	    }

}
