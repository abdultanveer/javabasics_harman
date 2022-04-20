package basics.inheritance;
class Splendor extends MyBike{  
	void run(){System.out.println("running safely with 60km");}  

	public static void main(String args[]){  
		MyBike b = new Splendor();//upcasting  
		b.run();  
	}  
} 