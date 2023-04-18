package com.hackerrank.work.problemsolving;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.hackerrank.work.problemsolving.day23.SumOfDigits;

public class Day23RecursionTest {
	
	private static SumOfDigits SUM_OF_DIGIT = null;
	
	
	@Before
	public void intialize()
	{
		SUM_OF_DIGIT = ( SUM_OF_DIGIT == null) ? new SumOfDigits() : SUM_OF_DIGIT;
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

}
