package basics.inheritance;
class Vehicle{  
	int speed = 100;
	
	 void run(){
		 System.out.println("Vehicle is running");
		 speed = 160;
	 }  
}  
//Creating a child class  
class Bike extends Vehicle{  
	@Override
	void run() {
		super.run();
		System.out.println("riding bike");
	}
}