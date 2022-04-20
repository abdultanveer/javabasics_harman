package basics.encapsultion;

public class SwCompany {
	
	public static void main(String[] args) {
		Programmer programmer = new Programmer();
		//programmer.name = "abdul";
		programmer.setName("abdul"); //setter is like a cap of the bottle -- water
		programmer.setDob("11/11/11");
		programmer.age = 14;
	}

}
