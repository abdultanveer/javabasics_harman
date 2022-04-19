package basics.inheritance;

public class Govt {

	
	public static void main(String[] args) {
		IncomeTax it = new IncomeTax();
		int tax = it.calculateTax(10000);
		System.out.println("tax payable is --"+tax);
		
		int newTax = it.calculateTax(10000, 1000);
		System.out.println("the new tax is--"+ newTax);
	}
}
