package basics.threads.sync;
class MyThread1 extends Thread{  
	Table t;  
	MyThread1(Table t, String threadName){  
		super(threadName);
		this.t=t;  
	}  
	public void run(){  
		t.printTable(5);  
	}  

}  