package basics.inheritance;

public class IncomeTax {
	int netIncome;
	
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
}
