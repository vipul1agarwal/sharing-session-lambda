package main.java.lambda;

import main.java.nolambda.FlexibleGreeter;
import main.java.nolambda.GoodMorningGreeting;
import main.java.nolambda.Greeting;

public class LambdaVsAnnonymousInnerClassGreeter {

	public void greet(Greeting greeting)
	{
		greeting.perform();
	}
	public static void main(String[] args) {
		LambdaVsAnnonymousInnerClassGreeter lambdaVsAnnonymousInnerClassGreeter = new LambdaVsAnnonymousInnerClassGreeter();

		Greeting morningLambdaGreeting = ()-> System.out.println("good morning team !!!");
		
		Greeting inClassGreeting = new Greeting() {

			@Override
			public void perform() {
				System.out.println("good morning team !!!");
			}
			
		};

		lambdaVsAnnonymousInnerClassGreeter.greet(morningLambdaGreeting);
		lambdaVsAnnonymousInnerClassGreeter.greet(inClassGreeting);
	}

}