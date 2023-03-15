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

public class Day17ModularArithmaticTest {
	
	private static FindExcelColumnNumber FIND_EXCEL_COL = null;
	private static HelpFromSam HELPFROM_SAM=null; 
	private static SingleNumberIII SINGLE_NUMBER_II = null;
	private static MaximumSatisfaction MAX_SATISFACTION = null;
	private static CompressBits COMPORESSBITS = null;
	
	@Before
	public void intialize()
	{
		FIND_EXCEL_COL = ( FIND_EXCEL_COL == null) ? new FindExcelColumnNumber() : FIND_EXCEL_COL;
		
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
	
	
	
	

}
