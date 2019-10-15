package main.java.lambda.V2;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName =lastName;
		this.age = age;
	}
	public String getFirstName()
	{
		return this.firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName=firstName;
	}
	
	public String getLastName()
	{
		return this.lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName=lastName;
	}	
	
	public int getAge()
	{
		return this.getAge();
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	
	@Override
	public String toString()
	{
		return "Person [FirstName = " +firstName+ " ,LastName = " +lastName+ " , Age = "+ age + "]";
	}
	
}
