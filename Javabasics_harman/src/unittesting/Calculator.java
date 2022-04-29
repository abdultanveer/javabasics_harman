package unittesting;

public class Calculator {
	
	//to check if this method is doing its job or not
	//10, 20 --> 30
	static int add(int a, int b) {
		System.out.println("i am in add method");
		int c=  a + b;
		System.out.println("i am exiting add method");
		return c;
	}
	
	static int multiply(int fno, int sno) {
		System.out.println("i am in add method");

		return fno * sno;
		
	}

}
