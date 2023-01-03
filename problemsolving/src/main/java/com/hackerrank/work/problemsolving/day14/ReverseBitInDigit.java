package com.hackerrank.work.problemsolving.day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.hackerrank.work.problemsolving.Utility;

public class ReverseBitInDigit {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// TODO Take First line using buffer reader and separate element by space.
		String firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "");
		long array = Long.valueOf(firstMultipleInput).longValue();
		Utility.getInstance().printData( new ReverseBitInDigit().reverse(array),System.out);
	}
	/**
	 * Reverse the bits of an 32 bit unsigned integer A.
	 * <br><b>0 <= A <= 232 </b>
	 * @param A First and only argument of input contains an integer A.
	 * @return Return a single unsigned integer denoting the decimal value of reversed bits.
	 */
	public long reverse(long A) {
		long result=0;
		int i=0;
		//TODO : implemented as per solution provided in discussion
		while (i<32) {
			//Do right shift and perform and "1" operation to check right most digit as "1"
			if( ((A>>i)&1)==1)
			{
				//If it's one then add decimal number with same power
				result = result+(long) (Math.pow(2, 31-i));				
			}
			i++;
		}
		return result;
	}
	
	

}
