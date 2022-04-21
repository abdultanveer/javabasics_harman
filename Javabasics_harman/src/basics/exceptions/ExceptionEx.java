package basics.exceptions;

public class ExceptionEx {
	
	public static void main(String[] args) {
		int a = 10;
		
		try {
			System.out.println("open and read from a file");
			int b = a/10;
			int[] nos = new int[5];
			nos[3] = 25;
			
			
		}
		
		
		
		
		catch(ArithmeticException ae) {
			System.out.println("open and read from a diff file");

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
		
		finally {
			System.out.println("whichever file you have opened we'll close it here");
		}
		
		
		
		
		//System.out.println("value of b is"+b);
		System.out.println("rest of the program");
	}

}
