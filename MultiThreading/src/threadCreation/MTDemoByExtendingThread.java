package threadCreation;

/**
 * @author abinash
 * A demo program to show, how to create thread extending Thread class
 */
public class MTDemoByExtendingThread extends Thread{
	
	public void run() {
		try {
			// Thread.currentThread() returns the ID or name of current running 
			// thread.
			System.out.println("Thread " + Thread.currentThread().getId() 
					           + " is running");
		} catch(Exception e) {
			System.out.println("Thread exception occured.");
		}
	}
	
	public static void main(String...args) {
		
		for(int i=0;i<10;i++) {
			MTDemoByExtendingThread thread = new MTDemoByExtendingThread();
			thread.start();
		}
	}
}
