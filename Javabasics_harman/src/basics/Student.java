package basics;

public class Student {
	static String COLLEGE_NAME;  //static variable
	//i'll create 5 partitions  -- instance variable
	String name;
	int age;   //4 bytes -- int
	boolean isMale;  //1byte
	String address;
	
	
	
	
	
	
	
	
	//COLLEGE_NAME = "IIT";
	
	
	  public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	static { System.out.println("static block invoked");
	  COLLEGE_NAME = "iit"; 
	  }
	 
	
	//-------------------------------
	public Student(){
		System.out.println("default constructor--shreyas");
		//COLLEGE_NAME = "IIT";
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

	static int calculateAverage(int[] marks) {
		int average = 0;
		for(int i=0; i< marks.length;i++) {
			average = average + marks[i];
		}
		return average/marks.length;
	}
}
