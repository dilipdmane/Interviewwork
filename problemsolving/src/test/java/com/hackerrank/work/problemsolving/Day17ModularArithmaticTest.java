package com.hackerrank.work.problemsolving;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.hackerrank.work.problemsolving.day15.CompressBits;
import com.hackerrank.work.problemsolving.day15.FindingGoodDays;
import com.hackerrank.work.problemsolving.day15.HelpFromSam;
import com.hackerrank.work.problemsolving.day15.MaximumSatisfaction;
import com.hackerrank.work.problemsolving.day15.SingleNumberIII;
import com.hackerrank.work.problemsolving.day17.FindExcelColumnNumber;
import com.hackerrank.work.problemsolving.day17.GreatestPossiblePositiveInteger;

public class Day17ModularArithmaticTest {
	
	private static FindExcelColumnNumber FIND_EXCEL_COL = null;
	private static GreatestPossiblePositiveInteger GREAT_POS_INT=null; 
	
	@Before
	public void intialize()
	{
		FIND_EXCEL_COL = ( FIND_EXCEL_COL == null) ? new FindExcelColumnNumber() : FIND_EXCEL_COL;
		GREAT_POS_INT = (GREAT_POS_INT == null )? new GreatestPossiblePositiveInteger() : GREAT_POS_INT;
		
	}
	
	@Test
	public void testExcelColumnNo_T1() {		
		String inp = "AB";
		int out = 28;		
		assertEquals(out,FIND_EXCEL_COL.titleToNumber(inp));
	}
	
	@Test
	public void testExcelColumnNo_T2() {		
		String inp = "BB";
		int out = 54;		
		assertEquals(out,FIND_EXCEL_COL.titleToNumber(inp));
	}
	
	@Test
	public void testGreatestPositiveInt_T1() {		
		int a=15,b=5;
		int out = 10;		
		assertEquals(out,GREAT_POS_INT.solve(a,b));
	}
	
	@Test
	public void testGreatestPositiveInt_T2() {		
		int a=15,b=50;
		int out = 35;		
		assertEquals(out,GREAT_POS_INT.solve(a,b));
	}
	
	
	
	

}
