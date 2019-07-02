package main.java.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExrciseSolutionJava7 {

public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Vipul","Agarwal",1),
				new Person("Zhaohua","Zhu",2),
				new Person("Shreya", "Shetty",3),
				new Person("Wang","Yuxi",4),
				new Person("Fang","Lina",5),
				new Person("nguyen","Tue",6)
				);
		
		//Step 1 : Sort list by last name
		Collections.sort(people, new Comparator<Person>(){

			@Override
			public int compare(Person arg0, Person arg1) {
				return arg0.getLastName().compareTo(arg1.getLastName());
			}
			
		});
		
		
		//Step 2 : Create method that prints all elements in this list
		System.out.println("prints all elements in this list :");
		printAll(people);
				
		//step 3 : create method to print people with last name starting with A 
		System.out.println("prints all elements with last name starting with A :");
		printLastNameStartsWithA(people);

	}

private static void printLastNameStartsWithA(List<Person> people) {
	for(Person p :people)
	{
		if(p.getLastName().startsWith("A")) {
			System.out.println(p);
		}
	}	
}

private static void printAll(List<Person> people) {
	for(Person p :people)
	{
		System.out.println(p);
	}
}


	
}
