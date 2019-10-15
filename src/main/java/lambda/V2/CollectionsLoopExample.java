package main.java.lambda.V2;

import java.util.Arrays;
import java.util.List;

public class CollectionsLoopExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Vipul","Agarwal",1),
				new Person("Zhaohua","Zhu",2),
				new Person("Huang", "Liushu",3),
				new Person("Wang","Yuxi",4),
				new Person("Fang","Lina",5),
				new Person("Ayush","Agarwal",6)
				);
		
		System.out.println("Using for loop");
		
		for(int i=0;i<people.size();i++)
		{
			System.out.println(people.get(i));
		}
		
		System.out.println("Using for in loop");

		for(Person p : people)
		{
			System.out.println(p);
		}
		
		System.out.println("Using for each loop");

		people.forEach(System.out::println);
		
	}
	
	
	

}
