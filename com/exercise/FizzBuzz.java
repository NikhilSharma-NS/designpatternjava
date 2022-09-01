package designpatternjava.com.exercise;

import java.util.Iterator;

public class FizzBuzz {

	public static void main(String[] args) {
		

		int input = 100;
		
		FizzBuzz fizzBuzz=new FizzBuzz();
		fizzBuzz.fizzBuzz(100);

	}

	public void fizzBuzz(int input) {

		for (int i = 1; i <= input; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			}else {
				System.out.println(i);
			}

		}
	}
}
