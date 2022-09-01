package designpatternjava.com.exercise;

public class ReverseInterger {
	public static void main(String[] args) {
		System.out.println(ReverseInterger.revserse(2147483647));

	}

	public static long revserse(int input) {
		long reverse = 0;
		while (input != 0) {
			int reminder = input % 10;
			reverse = reverse * 10 + reminder;
			input = input / 10;
			if (reverse < Integer.MIN_VALUE || reverse > Integer.MAX_VALUE) {
				return 0;
			}

		}
		return reverse;
	}
}
