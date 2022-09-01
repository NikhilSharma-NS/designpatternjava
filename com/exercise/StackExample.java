package designpatternjava.com.exercise;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		
		
		Stack<String> str=new Stack<>();
		
		str.push("abc");
		str.push("efg");
		
		System.out.println(str.peek());
		
		str.forEach((i)->System.out.println(i));
	}
	

}


