package com.hackerrank.work.problemsolving.day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.hackerrank.work.problemsolving.Utility;

public class AddBinaryString {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //TODO Take First line using buffer reader and separate element by space.
       String firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "");
       String firstMultipleInput2 = bufferedReader.readLine().replaceAll("\\s+$", "");
       Utility.getInstance().printData(new AddBinaryString().addBinary(firstMultipleInput, firstMultipleInput2), System.out);
	}
	
	/**
	 * Given two binary strings A and B. Return their sum (also a binary string).<br>
	 * <b>Problem Constraints</b>1 <br><= length of A <= 105<br>1 <= length of B <= 105
	 * <br> A and B are binary strings
	 * @param A  first binary strings.
	 * @param B second binary strings.
	 * @return Return a binary string denoting the sum of A and B
	 */
	 public String addBinary(String A, String B) 
	 { 
		 String retStr = "";
		 
		 int length = A.length()>=B.length() ? A.length():B.length();
		 int carry = 0;
		 for (int i = 0; i < length; i++) {
			int num1 = 0;
			int num2 = 0;
			int sum = 0;		
			
			num1 = i<A.length() ? Integer.parseInt(String.valueOf(A.charAt((A.length()-1)-i))):num1;
			num2 = i<B.length() ? Integer.parseInt(String.valueOf(B.charAt((B.length()-1)-i))):num2;
			
			sum = num1+num2+carry;
			
			carry = sum/2;
			retStr = String.valueOf(sum%2).concat(retStr);
			
		}
		 if( carry > 0 ) retStr = carry+"".concat(retStr);
		 return retStr;
	 }

}
