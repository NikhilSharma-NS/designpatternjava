package designpatternjava.com.exercise;

public class LongestPalindromSubstring {
	
	public static void main(String[] args) {
		boolean out= LongestPalindromSubstring.checkPalindromeOrnot("121");
		System.out.println(out);
		System.out.println(LongestPalindromSubstring.checkPalindromeOrnotAnotherWay("1314"));
		
		
	}
	
	public static boolean checkPalindromeOrnot(String input) {
		boolean isPlindrome=false;
		for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i)==input.charAt( input.length()-1-i)) {
					isPlindrome=true;
				}else {
					isPlindrome=false;
					return isPlindrome;
				}
		}
		return isPlindrome;
		
	}
	
	
	public static boolean checkPalindromeOrnotAnotherWay(String input) {
		
		int mid=input.length()%2;
		int midindex=0,midindex1=0;
		boolean istrue=false;
		
		if (mid==0){
			istrue=true;
			System.out.println("mid"+mid);
			midindex=input.length()/2;
			midindex1=input.length()/2-1;
		}else {
			System.out.println("elsemid"+mid);
			midindex=input.length()/2;
		}
	    for (int i = 0; i < input.length(); i++) {
	 
	        if (istrue) {
	        	  if (input.charAt(midindex)==input.charAt(midindex1)) {
	        		  
	        	  }
	        }else {
	        	 if (input.charAt(midindex-1)==input.charAt(midindex+1)) {
	        		  
	        	  }
	        }
	    	
	    	
		}
		
		
		
		
		return false;
	}

}
