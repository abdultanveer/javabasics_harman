package basics.exceptions;

public class ExceptionEx {
	
	public static void main(String[] args) {
		int a = 10;
		
		try {
			int b = a/0;
			int[] nos = new int[5];
			nos[6] = 25;
		}
		catch(ArithmeticException ae) {
			System.out.println("chemist handled it");
		}
		
		catch(ArrayIndexOutOfBoundsException aiobe) {
			System.out.println("aiobe handled it");

		}
		
		
		catch (Exception coolLecturer) {
			// TODO Auto-generated catch block
			//coolLecturer.printStackTrace();
			System.out.println("coolLecturer handled it");

		}
		
		//System.out.println("value of b is"+b);
		System.out.println("rest of the program");
	}

}
