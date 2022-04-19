package basics;

public class Demo {
//---------------------------------------------------	
	public static void main(String[] args) {
		int sum;
		sum = aparnaAdd(10,20);   //10 & 20 are arguments
		System.out.println("the sum is --"+sum);
		Student collegeStudent = new Student(); //new keyword -- create a box in the ram
		collegeStudent.askQuestion();
		collegeStudent.name = "abdul";
		System.out.println("Name of the student is--"+collegeStudent.name);
	}
//-------------------------------------------------------------
	 private static int aparnaAdd(int fno, int sno) { //fno and sno are params
		int result =  fno + sno;
		return result;
	}

}
