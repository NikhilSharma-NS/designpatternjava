package designpatternjava.com.exercise;

public class ReverseString {

	public static void main(String[] args) {

		String s = new String("my");

		String o=ReverseString.revserString(s);
		System.out.println(o);

	}
	
	
	public static String revserString(String input) {
		return new StringBuilder(input).reverse().toString();
	}
	

}
