package designpatternjava.com.myfile;

public class Demo1 {
	
	
	static void checkage(int age) {
		if (age <18){
			System.out.println("less then 18");

		}else {
			System.out.println("More then 18");

		}
	}
	
	public static void main(String[] args) {
		
		checkage(10);
		
	}

}
