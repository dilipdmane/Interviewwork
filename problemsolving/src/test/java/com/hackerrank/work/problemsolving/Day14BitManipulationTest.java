package com.hackerrank.work.problemsolving;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.hackerrank.work.problemsolving.day13.ChristmasTrees;
import com.hackerrank.work.problemsolving.day13.MaximumPositivity;
import com.hackerrank.work.problemsolving.day14.AddBinaryString;
import com.hackerrank.work.problemsolving.day14.SingleNumber;

public class Day14BitManipulationTest {
	
	private static AddBinaryString ADD_BIN_STR = null;
	private static SingleNumber SINGLE_NUMBER_INST = null;
	
	
	@Before
	public void intialize()
	{
		ADD_BIN_STR = ( ADD_BIN_STR == null) ? new AddBinaryString() : ADD_BIN_STR;
		SINGLE_NUMBER_INST = ( SINGLE_NUMBER_INST == null) ? new SingleNumber() : SINGLE_NUMBER_INST;
		
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
	

}
