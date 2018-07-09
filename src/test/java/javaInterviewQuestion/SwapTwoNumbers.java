package javaInterviewQuestion;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		int x = 5;
		int y = 10;
		
		//1. without using third variable using + operator:
		
//		x = x + y;
//		y = x - y;
//		x = x - y;
		
		//2. without using third variable using * operator:
		
		x = x * y;
		y = x / y;
		x = x / y;
		
		//3. using XOR ^:
		
//		x = x ^ y;
//		y = x ^ y;
//		x = x ^ y;
		
		System.out.println(x);
		System.out.println(y);
		
	}

}
