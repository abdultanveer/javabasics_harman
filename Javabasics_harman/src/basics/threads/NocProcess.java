package basics.threads;

public class NocProcess {
	
	public static void main(String[] args) {
		FeeThread feeThread = new FeeThread();
		feeThread.start();//this is like a different person starting
	//	feeThread.run();//this is like a normal method call
		
		try {
			feeThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HostelThread hostelThread = new HostelThread();
		Thread hostelFriendThread = new Thread(hostelThread);
		hostelFriendThread.start();
		
		LibraryThread libraryThread = new LibraryThread();
		libraryThread.start();
		
	}

}
