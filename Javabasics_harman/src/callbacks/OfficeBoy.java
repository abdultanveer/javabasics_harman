package callbacks;

public class OfficeBoy {

	public void doWork(MobilePhone mobilePhone) {
		System.out.println("left for rto");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("im done with rto work");
		mobilePhone.greenButton();
	}

}
