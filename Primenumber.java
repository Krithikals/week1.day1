package week1.day1;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 23;
		int halNum = num/2;
		boolean isPrimeNum = false;
		int primeNum;
		for (int i = 2; i < halNum; i++) {
			primeNum = num % i;
			if (primeNum == 0) {
				isPrimeNum = true;
				break;
			}

		}
		if (isPrimeNum == false) {
			System.out.println(num + " is a Primenumber ");
		} else {
			System.out.println(num + " is not a Primenumber ");
		}
	}

}
