package main.java.lambda.V2;

import java.util.function.BiConsumer;

public class ExceptionHandlerExample {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,6};
		int key =0;
		
		doProcess(arr,key,arithmeticWrapper((v,k)->System.out.println(v/k)));
	

	}
	
	private static BiConsumer<Integer, Integer> arithmeticWrapper(BiConsumer<Integer, Integer> c) {
		return (v,k)->{
			try {
				c.accept(v, k);
			} catch (ArithmeticException e) {
				System.out.println("arithmetic fail");
			}
		};
	}

	private static void doProcess(int[] arr, int key, BiConsumer<Integer,Integer> c) {
		for(int i : arr)
		{
			c.accept(i, key);
		}
	}

}
