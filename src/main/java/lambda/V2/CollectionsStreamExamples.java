package main.java.lambda.V2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CollectionsStreamExamples {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("Vipul","Agarwal",1),
				new Person("Zhaohua","Zhu",2),
				new Person("Huang", "Liushu",3),
				new Person("Wang","Yuxi",4),
				new Person("Fang","Lina",5),
				new Person("Ayush","Agarwal",6)
				);
		
//		people.stream().forEach(p->System.out.println(p));
		
		people.stream()
		.filter(p->p.getLastName().startsWith("L"))
		.forEach(System.out::println);

		Stream<Person> stream = people.stream(); 
		
		people.stream()
		.filter(p->p.getLastName().startsWith("L"));
		
		people.stream()
		.filter(p->p.getLastName().startsWith("L"))
		.count();
		
		people.parallelStream()
		.filter(p->p.getLastName().startsWith("L"))
		.count();
	}

}
