package basics.threads;

//this is abdul
public class NocProcess {
	
	public static void main(String[] args) {
		FeeThread aditya = new FeeThread("aditya");
		aditya.start();//this is like a different person starting
	//	feeThread.run();//this is like a normal method call
		
		try {
			aditya.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HostelThread hostelThread = new HostelThread();
		Thread aparna = new Thread(hostelThread);
		aparna.setName("aparna");
		aparna.start();
		
		LibraryThread ashwini = new LibraryThread();
		ashwini.setName("ashwini");
		ashwini.start();
		
	}

}
