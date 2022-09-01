package designpatternjava.com.myfile;

public class Demo2Recur {

	public static int findsum(int value) {
		int output = 0;

		while (value > 0) {
			output = value + output;
			System.out.println("Key: " + output);
			value = value - 1;
		}

		return output;
	}

	public static int findsumre(int value) {

		if (value > 0) {
			return value + findsum(value - 1);
		} else {
			return 0;
		}

	}

	public static void main(String[] args) {

		int sum = findsum(10);
		System.out.println("-----------------");
		System.out.println("Sum::" + sum);
		System.out.println("-----------------");
		int sumre = findsumre(10);
		System.out.println("Sum sumre::" + sumre);

	}
}
