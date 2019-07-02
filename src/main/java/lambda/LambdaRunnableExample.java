package main.java.lambda;

public class LambdaRunnableExample {

	public static void main(String[] args) {
		
		Thread myThread = new Thread(new Runnable() {
			// anonymous inner class
			@Override
			public void run() {
				System.out.println("printed inside runnable !!!");
			}
			
		});
		
		myThread.run();
		
		Thread myLambdaThread = new Thread(()->System.out.println("printed inside lambda runnable !!!"));
		
		myLambdaThread.run();
	}

}
