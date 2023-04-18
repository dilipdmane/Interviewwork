package com.hackerrank.work.problemsolving;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.hackerrank.work.problemsolving.day23.SumOfDigits;
import com.hackerrank.work.problemsolving.day24.SumOfDigitsMagicNUmber;

public class Day23RecursionTest {
	
	private static SumOfDigits SUM_OF_DIGIT = null;
	private static SumOfDigitsMagicNUmber SUM_OF_DIGIT_MAGIC = null;
	
	@Before
	public void intialize()
	{
		SUM_OF_DIGIT = ( SUM_OF_DIGIT == null) ? new SumOfDigits() : SUM_OF_DIGIT;
		SUM_OF_DIGIT_MAGIC = ( SUM_OF_DIGIT_MAGIC == null) ? new SumOfDigitsMagicNUmber() : SUM_OF_DIGIT_MAGIC;
	}

	@Test
	public void testSolve_postive() {
		int inp = 1234;
		int out = 10;
		assertEquals(out, SUM_OF_DIGIT.solve(inp));
	}
	
	@Test
	public void testSolve_postive_5_digits() {
		int inp = 12345;
		int out = 15;
		assertEquals(out, SUM_OF_DIGIT.solve(inp));
	}
	
	@Test
	public void testSolve_Magic_digit() {
		int inp = 83557;
		int out = 1;
		assertEquals(out, SUM_OF_DIGIT_MAGIC.solve(inp));
	}

}
