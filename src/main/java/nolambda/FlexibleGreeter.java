package main.java.nolambda;

public class FlexibleGreeter {

	public void greet(Greeting greeting)
	{
		
		greeting.perform();
	}
	public static void main(String[] args) {
		Greeting goodMorningGreeting = new GoodMorningGreeting();
		FlexibleGreeter flexibleGreeter = new FlexibleGreeter();
		
		flexibleGreeter.greet(goodMorningGreeting);
		
	}

}
