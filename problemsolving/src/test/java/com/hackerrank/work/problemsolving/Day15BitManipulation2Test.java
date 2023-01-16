package com.hackerrank.work.problemsolving;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.hackerrank.work.problemsolving.day15.FindingGoodDays;
import com.hackerrank.work.problemsolving.day15.HelpFromSam;

public class Day15BitManipulation2Test {
	
	private static FindingGoodDays FINDGOOD_DAY = null;
	private static HelpFromSam HELPFROM_SAM=null; 
	
	@Before
	public void intialize()
	{
		FINDGOOD_DAY = ( FINDGOOD_DAY == null) ? new FindingGoodDays() : FINDGOOD_DAY;
		HELPFROM_SAM = ( HELPFROM_SAM == null) ? new HelpFromSam() : HELPFROM_SAM;
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

}
