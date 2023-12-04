package com.orelly.java8.tcse1;

public class Aided extends Student{

	@Override
	public String result(String allMarks) {
		double cgpa = 0.0;
		double numertor = 0.0;
		double denom = 0.0;
		String[] marks = allMarks.split("\\|");
		
		String subMark = marks[0];
		String nccMark = marks[1];
		String sportMark = marks[2];
		
		for( int i=0; i<subMark.split(",").length;i++)
		{
			String mark = subMark.split(",")[i].split(" ")[0];
			String credirPoint = subMark.split(",")[i].split(" ")[1];			
			numertor = numertor+ getGradePoint(Integer.valueOf(mark).intValue())*Integer.valueOf(credirPoint).intValue();
			denom = denom + 5;
		}
		
		String[] nccMarks = nccMark.split(",");
		
		if( Integer.valueOf(nccMarks[0]).intValue()==1)
		{
			numertor = numertor+ getGradePoint(Integer.valueOf(nccMarks[1]).intValue())*Integer.valueOf(nccMarks[2]).intValue();
			denom = denom + 5;
		}
		
		String[] sportMarks = sportMark.split(",");
		
		if( Integer.valueOf(sportMarks[0]).intValue()==1)
		{
			numertor = numertor+ getGradePoint(Integer.valueOf(sportMarks[1]).intValue())*Integer.valueOf(sportMarks[2]).intValue();
			denom = denom + 5;
		}
		
		cgpa = numertor/denom;
		
		
		
		return String.format("%.2f",cgpa);
	}
	
	public double getGradePoint(int marks)
	{
		if( marks >74 & marks < 101)
		{
			return (( marks-75)*0.04)+9.0;
		}
		else if( marks >59 & marks < 75)
		{
			return (( marks-60)*0.07	)+8.0;
		}
		else if( marks >49 & marks < 60)
		{
			return (( marks-50)*0.1)+7.0;
		}
		else if( marks >39 & marks < 50)
		{
			return (( marks-40)*0.1)+6.0;
		}
		else
		{
			return 0.0;
		}
	}
	
	

}
