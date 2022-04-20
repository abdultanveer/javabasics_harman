package basics.inheritance;

public class Debugging {
	
	public static void main(String[] args) {
		//Debugging debugging = new Debugging();
		int sum = add(13,14);
		System.out.println("the result is --"+sum);
		int summation =0;
		for(int i=0;i<5;i++) {
			summation = summation + add(i,i+5);
			
		}
		System.out.println("after for loop");
	}
	
	static int add(int a, int b) {
		//20 lines of code -- only 3 lines
		int avg = a+b/2;
		return a+b;
	}

}
