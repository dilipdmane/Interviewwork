package com.hackerrank.work.problemsolving;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.hackerrank.work.problemsolving.day13.ChristmasTrees;
import com.hackerrank.work.problemsolving.day13.MaximumPositivity;
import com.hackerrank.work.problemsolving.day14.AddBinaryString;

public class Day14BitManipulationTest {
	
	private static AddBinaryString ADD_BIN_STR = null;
	
	
	
	@Before
	public void intialize()
	{
		ADD_BIN_STR = ( ADD_BIN_STR == null) ? new AddBinaryString() : ADD_BIN_STR;
		
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
	
	

}
