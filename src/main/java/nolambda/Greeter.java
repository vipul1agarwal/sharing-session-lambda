package main.java.nolambda;

public class Greeter {

	public void greet()
	{
		System.out.println("good evening costcore team");
	}
	
	public static void main(String[] args) {
		Greeter greetTheTeam = new Greeter();
		greetTheTeam.greet();
	}

}
