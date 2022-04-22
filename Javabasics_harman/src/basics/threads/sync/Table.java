package basics.threads.sync;
class Table{  
	
	void printTable(int n){//method not synchronized 
		System.out.println(Thread.currentThread().getName()+" has entered printable");
		
		synchronized(this){ //doctors cabin
			for(int i=1;i<=5;i++){  
				System.out.println(Thread.currentThread().getName()+"--"+n*i);  
				try{  
					Thread.sleep(400);  
				}catch(Exception e){System.out.println(e);}  
			}  

		}  
	}
}  