package designpatternjava.com.exercise;

import java.util.Arrays;

public class OwnStack {
	
	private int array[];
	
	private int top;
	
	private int capacity;
	
	public OwnStack(int capactity) {
		
		this.array=new int[capactity];
		this.capacity=capactity;
		this.top=-1;
	}
	
	public void push(int item) throws Exception {
		if (top==capacity){
			throw new Exception();
		}
		array[++top]=item;
		
	}
	
	public int pop() throws Exception {
		if (this.top==-1){
			throw new Exception();
		}
		return array[this.top--];
	}
	
	public int peek() {
		return array[this.top];
	}
	
	
	@Override
	public String toString() {
		return "OwnStack [array=" + Arrays.toString(array) + ", top=" + top + ", capacity=" + capacity + "]";
	}

	public static void main(String[] args) {
		OwnStack o=new OwnStack(2);
		try {
			o.push(1);
			o.push(2);
			o.pop();
			o.push(3);
			o.pop();
			o.push(4);
			
			System.out.println(o.peek());
	

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(o);
		
		
	}

}
