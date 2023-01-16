package com.hackerrank.work.problemsolving;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.hackerrank.work.problemsolving.day14.AddBinaryString;
import com.hackerrank.work.problemsolving.day14.InterestingArray;
import com.hackerrank.work.problemsolving.day14.Numberof1Bits;
import com.hackerrank.work.problemsolving.day14.ReverseBitInDigit;
import com.hackerrank.work.problemsolving.day14.SingleNumber;

public class Day14BitManipulationTest {
	
	private static AddBinaryString ADD_BIN_STR = null;
	private static SingleNumber SINGLE_NUMBER_INST = null;
	private static Numberof1Bits NOOFBIT_INST = null;
	private static ReverseBitInDigit REVERSEBIT_INST = null;
	private static InterestingArray INTERESTING_ARRAY = null;
	
	@Before
	public void intialize()
	{
		ADD_BIN_STR = ( ADD_BIN_STR == null) ? new AddBinaryString() : ADD_BIN_STR;
		SINGLE_NUMBER_INST = ( SINGLE_NUMBER_INST == null) ? new SingleNumber() : SINGLE_NUMBER_INST;
		NOOFBIT_INST = ( NOOFBIT_INST == null) ? new Numberof1Bits() : NOOFBIT_INST;
		REVERSEBIT_INST = (REVERSEBIT_INST ==null ) ? new ReverseBitInDigit() : REVERSEBIT_INST;
		INTERESTING_ARRAY = (INTERESTING_ARRAY ==null ) ? new InterestingArray() : INTERESTING_ARRAY;
	}
	
	@Test
	public void testAddBinaryStringOfNormalData() {		
		String STRING_1 = "100";
		String STRING2 = "101";
		String ANS_STRING = "1001";
		assertEquals(ANS_STRING,ADD_BIN_STR.addBinary(STRING_1,STRING2 ));
	}

	@Test
	public void testAddBinaryStringOfSameLength() {		
		String STRING_1 = "100";
		String STRING2 = "111";
		String ANS_STRING = "1011";
		assertEquals(ANS_STRING,ADD_BIN_STR.addBinary(STRING_1,STRING2 ));
	}
	
	@Test
	public void testAddBinaryStringOfDiffLength() {		
		String STRING_1 = "1000";
		String STRING2 = "111";
		String ANS_STRING = "1111";
		assertEquals(ANS_STRING,ADD_BIN_STR.addBinary(STRING_1,STRING2 ));
	}
	
	
	@Test
	public void testSingleNumberInArray() {		
		int[] INP_ARR = new int[] {1, 2, 2, 3, 1}; 
		int ans = 3;		
		assertEquals(ans,SINGLE_NUMBER_INST.singleNumber(INP_ARR));
	}
	
	@Test
	public void test2SingleNumberInArray() {		
		int[] INP_ARR = new int[] {1, 2, 2}; 
		int ans = 1;		
		assertEquals(ans,SINGLE_NUMBER_INST.singleNumber(INP_ARR));
	}
	
	
	@Test
	public void testNoOf1DigitInNumber() {		
		int inp = 450676354; 
		int ans = 14;		
		assertEquals(ans,NOOFBIT_INST.numSetBits(inp));
	}
	
	@Test
	public void testNoOf1DigitInNumberScalar() {		
		int inp = 450676354; 
		int ans = 14;		
		assertEquals(ans,NOOFBIT_INST.numSetBits2(inp));
	}
	
	@Test
	public void testReverseBit() {		
		long inp = 13; 
		long ans = Long.parseLong("2952790016");
		assertEquals(ans,REVERSEBIT_INST.reverse(inp));
	}
	
	@Test
	public void testReverseBitCheckReverse() {	
		long inp = Long.parseLong("2952790016");
		long ans = 13;
		assertEquals(ans,REVERSEBIT_INST.reverse(inp));
	}
	
	@Test
	public void testReverseBit2() {		
		long inp = 3; 
		long ans = Long.parseLong("3221225472");
		assertEquals(ans,REVERSEBIT_INST.reverse(inp));
	}
	
	@Test
	public void testInterestngArray() {		
		int[] inp = {9,17}; 
		String ans = "Yes";
		assertEquals(ans,INTERESTING_ARRAY.solve(inp));
	}
	
	@Test
	public void testInterestngArray2() {		
		int[] inp = {9}; 
		String ans = "No";
		assertEquals(ans,INTERESTING_ARRAY.solve(inp));
	}

}
