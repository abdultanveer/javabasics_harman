package basics.exceptions;

public class ThrowDemo {
	
	public static void main(String[] args) {
		validate(18);
	}
	
	
//--------------------------------------
	private static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("invalid age");
		}
		System.out.println("welcome to vote");
	}

}
