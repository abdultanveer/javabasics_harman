package callbacks;

public class Me {
	
	public static void main(String[] args) {
		OfficeBoy officeBoy = new OfficeBoy();
		MobilePhone mobilePhone = new MyBrother(); //wiring
		officeBoy.doWork(mobilePhone);
		System.out.println("gave office boy a work");
		Abdul abdul = new Abdul();
		abdul.start();
	}

}
