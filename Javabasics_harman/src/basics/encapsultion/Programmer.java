package basics.encapsultion;

public class Programmer {
	private String name;
	private String dob;
	protected int age;
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	private String getDob() { //sealed the tap
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		String programmersDob = getDob();
		this.age = age;
	}
	
	
}
