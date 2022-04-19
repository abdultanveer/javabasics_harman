package basics;

public class Student {
	//i'll create 5 partitions  -- instance variable
	String name;
	int age;   //4 bytes -- int
	boolean isMale;  //1byte
	String address;
	//-------------------------------
	public Student(){
		System.out.println("default constructor--shreyas");
	}
	
	//----------------------------------
	public Student(String sname) {
		System.out.println("aditya constructor");
		name = sname;
	}
	//---------------------------------
	public Student(int sage,String sname) {
		name = sname;
		age = sage;
	}
	//-----------------------
	void askQuestion() {
		System.out.println("asking java questions");
	}
	//--------------------------
	void writeExam() {}
	//--------------------------

}
