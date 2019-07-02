package main.java.lambda;

import main.java.nolambda.GoodMorningGreeting;
import main.java.nolambda.Greeting;

public class LambdaGreeter {

	public void greet(Greeting greeting)
	{
		
		greeting.perform();
	}
	public static void main(String[] args) {
		LambdaGreeter lambdaGreeter = new LambdaGreeter();
		Greeting goodMorningGreeting = new GoodMorningGreeting();
		
		Greeting morningLambdaGreeting = ()-> System.out.println("good morning team !!!");
		
		//passing by lambda value
		
		lambdaGreeter.greet(morningLambdaGreeting);
		
		// inline passing of the lambda expression
		
		lambdaGreeter.greet(()-> System.out.println("good morning team !!!"));
	}

}
