package main.java.lambda;

import main.java.nolambda.GoodMorningGreeting;
import main.java.nolambda.Greeting;

public class LambdaVsInterfaceImplGreeter {

	public void greet(Greeting greeting)
	{
		greeting.perform();
	}
	public static void main(String[] args) {
		Greeting goodMorningGreeting = new GoodMorningGreeting();
		
		Greeting morningLambdaGreeting = ()-> System.out.println("good morning team !!!");
		
		goodMorningGreeting.perform();
		
		morningLambdaGreeting.perform();
	}

}
