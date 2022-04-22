package basics.threads.sync;
class TestSynchronization1{  
	public static void main(String args[]){  
		Table obj = new Table();//only one object  -- shared object/ traffic junction
		MyThread1 t1 = new MyThread1(obj,"road-1");  
		MyThread2 t2 = new MyThread2(obj,"road-2");  
		t1.start();  
		t2.start();  
	}  
}  