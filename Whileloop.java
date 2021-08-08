package week1.day1;

public class Whileloop {

	public static void main(String[] args) {
		int num = 345;
		int a,b;
		int d=0;
		
		while( num != 0)
		{
			a= num/10; 
			b= num % 10;
			num = a;
			d= d+b;	
		}
		System.out.println("Sum is " + d);
	}
}
