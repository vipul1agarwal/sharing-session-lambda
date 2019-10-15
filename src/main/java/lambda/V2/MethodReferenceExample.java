package main.java.lambda.V2;

public class MethodReferenceExample {

	public static void main(String[] args) {
		Thread t = new Thread(MethodReferenceExample::process); // ()->method()
		t.run();
	}
	
	public static void process()
	{
		System.out.println("Hello World!!!");
	}

}
