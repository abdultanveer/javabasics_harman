package basics;

public class Demo {
//---------------------------------------------------	
	public static void main(String[] args) {
		int sum;
		sum = aparnaAdd(10,20);   //10 & 20 are arguments
		Student abdul; //declaration
		abdul = new Student(); //instantiation
		//abdul.name = "ansari"; //initialization
		abdul.setName("ansari");
		
		int a; //declaration
		a = 10; //initialization
		
		
		
		System.out.println("the college name is"+ Student.COLLEGE_NAME);
		
		//System.out.println("the sum is --"+sum);
		/*
		 * Student collegeStudent = new Student(123,"ansari"); //new keyword -- create a
		 * box in the ram
		 * 
		 * 
		 * System.out.println("student name is---"+ collegeStudent.name);
		 * System.out.println("student age is---"+ collegeStudent.age);
		 * 
		 * Student javaStudent = new Student(); javaStudent.name = "abdul";
		 */
		/*
		 * collegeStudent.askQuestion(); collegeStudent.name = "abdul";
		 * System.out.println("Name of the student is--"+collegeStudent.name);
		 */
	}
//-------------------------------------------------------------
	 private static int aparnaAdd(int fno, int sno) { //fno and sno are params
		int result =  fno + sno;
		return result;
	}
	//--------------------------

}
