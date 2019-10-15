package main.java.lambda.V2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalInterfaceExample {

public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Vipul","Agarwal",1),
				new Person("Zhaohua","Zhu",2),
				new Person("Huang", "Liushu",3),
				new Person("Wang","Yuxi",4),
				new Person("Fang","Lina",5),
				new Person("Ayush","Agarwal",6)
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
		printConditionally(people, p->true,p->System.out.println(p));
		
		System.out.println("=====================================");

		//step 3 : create method to print people with last name starting with A 
		System.out.println("prints all elements with last name starting with A :");
		printConditionally(people,p-> p.getLastName().startsWith("A"),p->System.out.println(p.getFirstName()));
		
		System.out.println("=====================================");

		//step 4 : create method to print people with last name starting with Z
		System.out.println("prints all elements with last name starting with Z :");
		printConditionally(people,p->p.getLastName().startsWith("Z"),p->System.out.println(p.getLastName()));

	}

private static void printConditionally(List<Person> people,Predicate<Person> c,Consumer<Person> d) {
	for(Person p :people)
	{
		if(c.test(p)) {
			d.accept(p);
		}
	}	
}
}
