package designpatternjava.com.exercise;

public class ReverseStringApproach2 {
	
	public static void main(String[] args) {
		
		
		String s=new String("123");
		
		String s1=ReverseStringApproach2.reverseString(s);
		System.out.println(s1);
		
	}
	
	
	public static String reverseString(String inputstr) {
		StringBuilder sb=new StringBuilder();	
		for (int i = inputstr.length()-1; i >= 0; i--) {
			sb.append(inputstr.charAt(i));
	}
		return sb.toString();
	}

}
