package basics.inheritance;

public class Gst extends IncomeTax {
	String category;
	
	int calculateGst(int income, String category) {
		int oldTax = super.calculateTax(income);
		int gst = super.calculateTax(income, 2000);
		return oldTax;
	}
}
