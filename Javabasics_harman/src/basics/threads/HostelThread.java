package basics.threads;

public class HostelThread  implements Runnable{

	@Override
	public void run() {
		System.out.println("getting signature from hostel");
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(200);
				System.out.println(i*100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
