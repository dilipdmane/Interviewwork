package com.orelly.java8;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StudyProgramCollections {

	public static void main(String[] args) {

		
		LinkedList<StudentResult> results = getStudentResult();
		
		List<String> collect = results.stream().filter(result -> result.roundedPercentage>55)
		.map( result-> result.name)
		.distinct()
		.sorted()
		.collect(Collectors.toList());		
		collect.forEach(System.out::println);
		
		Supplier<StudentResult> cnStu = StudentResult::new;
		StudentResult studentResult = cnStu.get();

	}
	
	private static LinkedList<StudentResult> getStudentResult() {

		LinkedList<StudentResult> results = new LinkedList<StudyProgramCollections.StudentResult>();
		results.add(new StudentResult("Dilip", 85, "Java"));
		results.add(new StudentResult("Dilip", 35, "Python"));
		results.add(new StudentResult("Dilip", 45, "RLan"));
		results.add(new StudentResult("Daksh", 85, "Java"));
		results.add(new StudentResult("Daksh", 93, "Python"));
		results.add(new StudentResult("Bhavesh", 75, "RLan"));
		return results;
	}

	static class StudentResult
	{
		String name;		
		int roundedPercentage;
		String examName;
		
		public StudentResult() {
			// TODO Auto-generated constructor stub
		}
		
		public StudentResult(String name, int roundedPercentage, String examName) {
			super();
			this.name = name;
			this.roundedPercentage = roundedPercentage;
			this.examName = examName;
		}
		
		public String getExamName() {
			return examName;
		}		
		
		
	}

}
