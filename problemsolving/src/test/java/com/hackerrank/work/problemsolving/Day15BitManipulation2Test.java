package com.hackerrank.work.problemsolving;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.hackerrank.work.problemsolving.day15.FindingGoodDays;
import com.hackerrank.work.problemsolving.day15.HelpFromSam;
import com.hackerrank.work.problemsolving.day15.MaximumSatisfaction;
import com.hackerrank.work.problemsolving.day15.SingleNumberIII;

public class Day15BitManipulation2Test {
	
	private static FindingGoodDays FINDGOOD_DAY = null;
	private static HelpFromSam HELPFROM_SAM=null; 
	private static SingleNumberIII SINGLE_NUMBER_II = null;
	private static MaximumSatisfaction MAX_SATISFACTION = null;
	
	@Before
	public void intialize()
	{
		FINDGOOD_DAY = ( FINDGOOD_DAY == null) ? new FindingGoodDays() : FINDGOOD_DAY;
		HELPFROM_SAM = ( HELPFROM_SAM == null) ? new HelpFromSam() : HELPFROM_SAM;
		SINGLE_NUMBER_II = ( SINGLE_NUMBER_II == null) ? new SingleNumberIII() : SINGLE_NUMBER_II;
		MAX_SATISFACTION = ( MAX_SATISFACTION == null) ? new MaximumSatisfaction() : MAX_SATISFACTION;
	}
	
	@Test
	public void testFindGoodDays() {		
		int inp = 5;
		int out = 2;		
		assertEquals(out,FINDGOOD_DAY.solve(inp));
	}
	
	@Test
	public void testFindGoodDays2() {		
		int inp = 8;
		int out = 1;		
		assertEquals(out,FINDGOOD_DAY.solve(inp));
	}
	
	@Test
	public void testHelpFromSam1() {		
		int inp = 5;
		int out = 2;		
		assertEquals(out,HELPFROM_SAM.solve(inp));
	}
	
	@Test
	public void testHelpFromSam2() {		
		int inp = 3;
		int out = 2;		
		assertEquals(out,HELPFROM_SAM.solve(inp));
	}
	
	@Test
	public void testHelpFromSingleNumberII() {		
		int[] inp = {1, 2, 3, 1, 2, 4};
		int[] out = {3,4};		
		assertArrayEquals(out,SINGLE_NUMBER_II.solve(inp));
		
	}
	
	@Test
	public void testHelpFromSingleNumberII2() {		
		int[] inp = {1,2};
		int[] out = {1,2};		
		assertArrayEquals(out,SINGLE_NUMBER_II.solve(inp));
	}
	
	@Test
	public void testMaxSatisFaction_1() {		
		int[] inp = {2, 2, 7, 15};
		int out = 2;		
		assertEquals(out,MAX_SATISFACTION.solve(inp));
	}
	
	@Test
	public void testMaxSatisFaction_2() {		
		int[] inp = {10, 20, 15, 4, 14};
		 int out = 4;		
		assertEquals(out,MAX_SATISFACTION.solve(inp));
	}
	
	

}
