package programs.java.threads;

public class Consumer implements Runnable{
	
	private static int count=0;
	
	
	public void run() {
		
		while(count<10) {			
		
		synchronized(this) {
		count++;
		System.out.println(Thread.currentThread().getName()+":"+count);
		}
		try {
		wait();
		}catch(InterruptedException ie) {
			
		}
	}
	}

}
