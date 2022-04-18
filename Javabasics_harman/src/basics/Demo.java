package basics;

public class Demo {
//---------------------------------------------------	
	public static void main(String[] args) {
		int sum;
		sum = aparnaAdd(10,20);
		System.out.println("the sum is --"+sum);
	}
//-------------------------------------------------------------
	static int aparnaAdd(int fno, int sno) {
		int result =  fno + sno;
		return result;
	}

}
