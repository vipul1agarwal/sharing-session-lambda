package main.java.lambda;

import main.java.nolambda.Greeting;

public class LambdaTypeInference {

	public static void main(String[] args) {
		LambdaStringSize stringSize = str-> str.length();
		
		System.out.println(stringSize.getSize("Hello World!!"));
	
	}
interface LambdaStringSize {
	int getSize(String str);
}
}
