package programs.java.threads;

public class Synchronizer {

	public static void main(String args[]) {
		
		Consumer consumer = new Consumer();
		
		Thread thread1 = new Thread(consumer);
		Thread thread2 = new Thread(consumer);
		Thread thread3 = new Thread(consumer);
		
		
		thread1.start();
		thread2.start();
		thread3.start();
		
	}
	
	
}
