package week1.day1;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstNum = 0;
		int secondNum = 1;
		int sumFinal;
		System.out.println(firstNum);
		for (int i = 1; i < 10; i++) {
			sumFinal = firstNum + secondNum;// 21
			firstNum = secondNum;// 13
			secondNum = sumFinal;// 21
			System.out.println(sumFinal);

		}
	}

}
