package basics.threads.sync;
class MyThread2 extends Thread{  
	Table t;  
	MyThread2(Table t, String tName){  
		super(tName);
		this.t=t;  
	}  
	public void run(){  
		t.printTable(100);  
	}  
}  