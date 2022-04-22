package basics.threads;

public class LibraryThread extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("ashwini --library thread");
		for(int i=1;i<6;i++) {
			try {
				Thread.sleep(200);
				System.out.println(Thread.currentThread().getName()+"--"+i*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
