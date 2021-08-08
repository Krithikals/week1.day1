package week1.day1;

public class Amstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 371;
		int a = num;
		int b;
		int d = 0;

		while (num != 0) {
			b = num % 10;
			num = num / 10;
			d = d + (b * b * b);
		}
		if (d == a) {
			System.out.println("This is amstrong number " + d);
		} else {
			System.out.println("It is not " + d);
		}

	}

}
