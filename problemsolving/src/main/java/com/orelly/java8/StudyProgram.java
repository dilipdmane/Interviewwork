package com.orelly.java8;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

@FunctionalInterface
interface NamePrint
{
	void printHello(String name);
}

class Employee{
	private String name = "";
	private int age = 0;
	
	

	public String getName() {
		return name;
	}
	public Employee()
	{
		
	}

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.setAge(age);
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Employee getEmployee()
	{
		return new Employee();
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class StudyProgram {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub		
	
		NamePrint namePrint= name -> System.out.println("Lamda Works.."+name);	
		namePrint.printHello("Dilip ");
		
		System.out.println("StudyProgram.main() optional "+Optional.ofNullable(new Employee().getEmployee()).isPresent()+"]");
		
		Stream<String> stream = Stream.of("Dilip","Mane");
		
		stream.map(name -> name.toUpperCase()).forEach(str->System.out.print(str));
		
		Optional<Employee> optional = Optional.of(new Employee("Dilip",55));
		
		boolean present = optional.map(p -> p.getAge())
		.filter(age -> age>=35 )
		.filter(age -> age <55)
		.isPresent();
		
		System.out.println("StudyProgram.main() "+present);
		
		/**
		 * Method Interfaces Start
		 */
		
		Consumer<String> accConsumer =   System.out::println; // Static Mehod
		
		accConsumer.accept("Using Consumer");		
		
		Function<String, Integer> methodRef =Integer::parseInt;//TODO Static method references
		
		System.out.println("Static method references["+methodRef.apply("55")+"]");
		
		String inpString = "Dilip";
		Supplier<String> supp = inpString::toUpperCase;// bounded Instance Method References		
		System.out.println("StudyProgram.main() Instance Method References ["+supp.get()+"]");
		
		Function<String, String> fnUpperCase = String::toUpperCase;	// Un-bounded Instance Method References		
		System.out.println(fnUpperCase.apply("Dilip Unbouned"));
		
		
		
		/**
		 * Method Interfaces End
		 */
		
		Runnable runn = ()->System.out.println("Static Method Runnable interface");		
		runn.run();		
		StringRunnable name2 = name-> System.out.println("Hello, "+ name + " !");
		name2.run("Dilip");
		
		
		/****
		 * Predicate START
		 */
		
		Predicate<Person> isAdult = person -> person.age>17;		
		System.out.println(isAdult.test(new Person("Dilip", 40))+"");		
		
	 }
	
	
	
	
	@FunctionalInterface
	public interface StringRunnable {
	    /**
	     * Runs this operation.
	     */
	    void run(String name);
	}
	
	

}

class Person{
	String name;
	int age;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
}

