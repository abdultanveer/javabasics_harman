package basics.threads;

public class NocProcess {
	
	public static void main(String[] args) {
		FeeThread feeThread = new FeeThread();
		feeThread.start();
		HostelThread hostelThread = new HostelThread();
		Thread hostelFriendThread = new Thread(hostelThread);
		hostelFriendThread.start();
		
	}

}
