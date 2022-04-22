package basics.threads;

public class FeeThread extends Thread{
	
	@Override
	public void run() {
		super.run();
		System.out.println("getting signature from fee dept");
	}

}
