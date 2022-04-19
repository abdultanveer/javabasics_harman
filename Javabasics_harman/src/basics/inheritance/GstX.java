package basics.inheritance;

public class GstX {
int netIncome;
String category;
	
	//-------------------------------------
	int calculateTax(int income) {
		return income/10;
	}
	//------------------------------
	int calculateTax(int income, int luxurySpending) {
		int tax = income/10;
		int luxuryTax = luxurySpending/5;
		
		return tax + luxuryTax;
	}
	
	//int calculateGst(String category) {
		
	//}
	
	/*
	 * int calculateGst(int income, String category) { int oldTax =
	 * super.calculateTax(income); int gst = super.calculateTax(income, 2000);
	 * return oldTax; }
	 */
}
